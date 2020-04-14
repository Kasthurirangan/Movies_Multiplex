package service;

import entity.AlotMovieentity;
import entity.Movieentity;
import entity.Multiplexentity;
import models.SearchMovieResult;
import models.SearchMultiplexResult;
import play.mvc.Result;
import repositiries.AlotMoviesrepo;
import repositiries.Movierepo;
import repositiries.Multiplexrepo;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;

public class Searchservice {

    @Inject
    Movierepo movierepo;

    @Inject
    Multiplexrepo multiplexrepo;


    private List<SearchMovieResult> searchMovieResultList = new ArrayList<>();

    private List<SearchMultiplexResult> searchMultiplexResultList = new ArrayList<>();

    public List<SearchMovieResult> getlist_movie(String search_value) {
        searchMovieResultList =  this.movierepo.get_search_result(search_value);
        if(searchMovieResultList.isEmpty())
        {
            searchMovieResultList =  this.movierepo.get_search_movie_only_result(search_value);
        }
        return searchMovieResultList;
    }

    public List<SearchMultiplexResult> getlist_multiplex(String search_value) {
        searchMultiplexResultList =  this.multiplexrepo.get_search_result(search_value);
        if(searchMovieResultList.isEmpty())
        {
            searchMultiplexResultList =  this.multiplexrepo.get_search_multiplex_only_result(search_value);
        }
        return searchMultiplexResultList;
    }
}
