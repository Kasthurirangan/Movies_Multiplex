package controllers;

import play.mvc.Result;

import static play.mvc.Results.ok;

public class SearchController {

    public Result search()
    {
        return ok(views.html.search.startsearch.render());
    }
}
