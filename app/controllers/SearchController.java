package controllers;

import Actor.SocketActor;
import akka.actor.ActorSystem;
import akka.stream.Materializer;
import akka.stream.javadsl.Flow;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.F;
import play.libs.streams.ActorFlow;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.WebSocket;

import javax.inject.Inject;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.mvc.Results.ok;

public class SearchController {

    @Inject
    private ActorSystem actorSystem;

    @Inject
    private Materializer materializer;

    public WebSocket socket()
    {
        return WebSocket.Json.acceptOrResult(this::createActorFlow);
    }

    private CompletionStage<F .Either<Result, Flow<JsonNode, JsonNode, ?>>> createActorFlow(Http.RequestHeader header)
    {
        return CompletableFuture.completedFuture(F.Either.Right(createFlowForActor()));
    }

    private Flow<JsonNode, JsonNode, ?> createFlowForActor()
    {
        return ActorFlow.actorRef(guardianActorRef ->{
            return  SocketActor.init(guardianActorRef);
        }, this.actorSystem, this.materializer);
    }

    public Result index(Http.Request request)
    {
        String url = routes.SearchController.socket().webSocketURL(request);
        return ok(views.html.search.startsearch.render(url));
    }
}
