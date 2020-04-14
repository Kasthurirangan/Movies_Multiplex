package controllers;


import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;
import service.Searchservice;
import util.ResponseDesigner;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class SearchRestController extends Controller {

    @Inject
    Searchservice searchservice;

    @Inject
    HttpExecutionContext httpExecutionContext;

    public CompletionStage<Result> search(String search_value, Integer multiplex_movie)
    {
        if(multiplex_movie == 1)
        {
            return supplyAsync(() -> ok( ResponseDesigner.design(this.searchservice.getlist_movie(search_value), true)), httpExecutionContext.current());
        }
        else
        {
            return  supplyAsync(() -> ok(ResponseDesigner.design(this.searchservice.getlist_multiplex(search_value), true)), httpExecutionContext.current());

        }
    }
}
