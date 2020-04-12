package controllers;

import models.Alotmoviemodel;
import models.Moviesmodels;
import models.Multiplexmodels;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.AlotMovieservice;
import service.Movieservice;
import service.Multiplexservice;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class MultiplexController extends Controller {

    @Inject
    FormFactory formFactory;

    @Inject
    MessagesApi messagesApi;

    @Inject
    Multiplexservice multiplexservice;

    @Inject
    Movieservice movieservice;

    @Inject
    AlotMovieservice alotMovieservice;

    private static  List<String> movie_timing = new ArrayList<>();

    static {
        movie_timing.add("09:00 - 12:00");
        movie_timing.add("12:00 - 15:00");
        movie_timing.add("15:00 - 18:00");
        movie_timing.add("18:00 - 21:00");
        movie_timing.add("21:00 - 00:00");
    }

    public  MultiplexController()
    {
        new Multiplexmodels();
    }

    public Result index()
    {
        List<Multiplexmodels> multiplexmodelsList = this.multiplexservice.to_display();
        return  ok(views.html.multiplex.index.render(multiplexmodelsList));
    }

    public Result create(Http.Request request)
    {
        Form<Multiplexmodels> multiplexmodelsForm = formFactory.form(Multiplexmodels.class);
        return ok(views.html.multiplex.create.render(multiplexmodelsForm, request, messagesApi.preferred(request)));
    }

    public  Result save(Http.Request request)
    {
        DynamicForm multiplexmodelsForm = formFactory.form().bindFromRequest(request);
        String Multiplexname = multiplexmodelsForm.get("Multiplexname");
        String Address = multiplexmodelsForm.get("address");
        int no_of_screen = Integer.parseInt(multiplexmodelsForm.get("num_of_screens"));
        Multiplexmodels multiplexmodels = new Multiplexmodels(Multiplexname, Address, no_of_screen);
        this.multiplexservice.add_multiplex(multiplexmodels, movie_timing);
        return redirect(routes.MultiplexController.index());
    }

    public  Result show(Integer id, Http.Request request)
    {
        List<Multiplexmodels> multiplexmodelsList = this.multiplexservice.get_movie_id(id);
        return ok(views.html.multiplex.show.render(multiplexmodelsList, request, messagesApi.preferred(request)));
    }

    public Result edit(Integer id, Http.Request request)
    {
        List<Multiplexmodels> multiplexmodelsList = this.multiplexservice.get_movie_id(id);
        Multiplexmodels multiplexmodels = Multiplexmodels.list_to_edit(multiplexmodelsList);
        Form<Multiplexmodels> multiplexmodelsForm = formFactory.form(Multiplexmodels.class).fill(multiplexmodels);
        return ok(views.html.multiplex.edit.render(multiplexmodelsForm, id, request, messagesApi.preferred(request)));
    }

    public  Result update(Integer id, Http.Request request)
    {
        DynamicForm multiplexmodelsform = formFactory.form().bindFromRequest(request);
        String name = multiplexmodelsform.get("Multiplexname");
        String address = multiplexmodelsform.get("address");
        int num_of_screens = Integer.parseInt(multiplexmodelsform.get("num_of_screens"));
        System.out.println("the value of number of screens are " +num_of_screens);
        Multiplexmodels multiplexmodels = new Multiplexmodels(name, address, num_of_screens);
        this.multiplexservice.update_by_id(multiplexmodels, id, movie_timing);
        return redirect(routes.MultiplexController.index());
    }

    public  Result delete(Integer id, Http.Request request)
    {
        this.multiplexservice.delete_by_id(id);
        return redirect(routes.MultiplexController.index());
    }

    public  Result index_allocation()
    {
        List<Alotmoviemodel> alotmoviemodelList = this.alotMovieservice.to_display();
        return ok(views.html.alotmovie.index.render(alotmoviemodelList));
    }
    public  Result alotmovie(Integer multiplex_id, String name, Integer id, Http.Request request)
    {
        List<Moviesmodels> moviesmodelList = this.movieservice.getallMovies();
        return ok(views.html.alotmovie.movie_allocation.render(moviesmodelList, multiplex_id, id, name, movie_timing, request, messagesApi.preferred(request)));
    }

    public  Result allocate_success_or_not(Integer multiplex_id, Integer id, Integer movie_id, String timing, Http.Request request)
    {
        List<Alotmoviemodel> alotmoviemodelList = this.alotMovieservice.to_check_allocation_possible(id, timing, multiplex_id, movie_id);
        if (alotmoviemodelList.isEmpty())
        {
            return ok(views.html.alotmovie.nothing.render());
        }
        else
        {
            return redirect(routes.MultiplexController.index_allocation());
        }
    }
}