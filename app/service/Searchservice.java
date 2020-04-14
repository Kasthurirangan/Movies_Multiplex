package service;

import models.SearchMovieResult;
import models.SearchMultiplexResult;
import repositiries.Movierepo;
import repositiries.Multiplexrepo;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
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
        System.out.println("the list value is " +searchMovieResultList);
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
