package controllers;

import models.Moviesmodels;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.Movieservice;

import javax.inject.Inject;
import java.util.List;

public class MoviesController extends Controller {

    @Inject
    FormFactory formFactory;

    @Inject
    MessagesApi messagesApi;

    @Inject
    Movieservice movieservice;

    public MoviesController()
    {
        new Moviesmodels();
    }

    public Result index()
    {
        List<Moviesmodels> moviesmodelList = this.movieservice.getallMovies();
        return ok(views.html.movies.index.render(moviesmodelList));
    }

    public Result create(Http.Request request)
    {
        Form<Moviesmodels> moviesmodelForm = formFactory.form(Moviesmodels.class);
        return ok(views.html.movies.create.render(moviesmodelForm, request, messagesApi.preferred(request)));
    }

    public Result save(Http.Request request)
    {
        DynamicForm moviesmodelForm = formFactory.form().bindFromRequest(request);
        String name = moviesmodelForm.get("name");
        String category = moviesmodelForm.get("category");
        String producer = moviesmodelForm.get("producer");
        String director = moviesmodelForm.get("Director");
        String date = moviesmodelForm.get("date");
        Moviesmodels moviesmodel = new Moviesmodels(name, category, producer, director, date);
        this.movieservice.addMovie(moviesmodel);
        return  redirect(routes.MoviesController.index());
    }

    public Result show(Integer id, Http.Request request)
    {
        List<Moviesmodels> moviesmodels = this.movieservice.get_movie_id(id);
        return ok(views.html.movies.show.render(moviesmodels, request, messagesApi.preferred(request)));
    }

    public Result edit(Integer id, Http.Request request)
    {
        List<Moviesmodels> moviesmodelslist = this.movieservice.get_movie_id(id);
        Moviesmodels moviesmodels = Moviesmodels.list_to_edit(moviesmodelslist);
        Form<Moviesmodels> moviesmodelsForm = formFactory.form(Moviesmodels.class).fill(moviesmodels);
        return ok(views.html.movies.edit.render(moviesmodelsForm, id, request, messagesApi.preferred(request)));
    }

    public Result update(Integer id, Http.Request request)
    {
        DynamicForm moviesmodelForm = formFactory.form().bindFromRequest(request);
        String name = moviesmodelForm.get("name");
        String category = moviesmodelForm.get("category");
        String producer = moviesmodelForm.get("producer");
        String director = moviesmodelForm.get("Director");
        String date = moviesmodelForm.get("date");
        Moviesmodels moviesmodel = new Moviesmodels(name, category, producer, director, date);
        this.movieservice.update_by_id(moviesmodel, id);
        return redirect(routes.MoviesController.index());
    }

    public Result delete(Integer id, Http.Request request)
    {
        this.movieservice.delete_by_id(id);
        return redirect(routes.MoviesController.index());
    }
}
