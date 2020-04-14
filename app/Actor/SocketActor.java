package Actor;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.http.javadsl.Http;
import akka.http.javadsl.marshallers.jackson.Jackson;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.stream.Materializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Collectivemodels;
import models.Searchmodel;

import java.util.concurrent.CompletionStage;

public class SocketActor extends AbstractActor {

    private ActorRef guardian;

    public SocketActor(ActorRef guardian)
    {
        this.guardian = guardian;
    }

    public  static Props init(ActorRef guardian)
    {
        return  Props.create(SocketActor.class, () -> new SocketActor(guardian));
    }

    private void processMessage(JsonNode jsonNode)
    {
        ObjectMapper objectMapper = new ObjectMapper();
        Searchmodel searchmodel = objectMapper.convertValue(jsonNode, Searchmodel.class);
        CompletionStage<HttpResponse> responseCompletionStage = this.calling_rest(searchmodel.getSearch_value(), searchmodel.getMultiplex_movie());
        responseCompletionStage.thenCompose(this::consumeHttpResponse)
                .thenAccept(searchMessage -> {
                    System.out.println("DATA : " + searchMessage);
                    ObjectMapper mapper = new ObjectMapper();
                    JsonNode json = mapper.valueToTree(searchMessage);
                    System.out.println(json.toPrettyString());
                    this.guardian.tell(json, getSelf());
                }).exceptionally(t -> {
            t.printStackTrace();
            return null;
        });
    }

    private CompletionStage<Collectivemodels> consumeHttpResponse(HttpResponse httpResponse) {
        Materializer materializer = Materializer.matFromSystem(getContext().getSystem());

        ObjectMapper mapper = new ObjectMapper();
        return Jackson.unmarshaller(mapper, Collectivemodels.class)
                .unmarshal(httpResponse.entity(), materializer)
                .thenApply(messageModel -> {
                    this.discardEntity(httpResponse, materializer);
                    return messageModel;
                });
    }

    private void discardEntity(HttpResponse httpResponse, Materializer materializer) {
        httpResponse.discardEntityBytes(materializer)
                .completionStage()
                .whenComplete((done, ex) -> System.out.println("Discarded"));
    }

    private CompletionStage<HttpResponse> calling_rest(String search_value, Integer multiplex_movie) {
        return Http.get(getContext().getSystem()).singleRequest(HttpRequest.create("http://localhost:9000/api/search?search_value=" +search_value +"&multiplex_movie=" +multiplex_movie));
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(JsonNode.class , this::processMessage)
                .build();
    }
}
