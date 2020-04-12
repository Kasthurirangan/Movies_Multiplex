package service;

import entity.Movieentity;
import models.Moviesmodels;
import repositiries.Movierepo;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
public class Movieservice {

    @Inject
    private Movierepo movierepo;

    private static  List<Movieentity> movieentityList = new ArrayList<>();

    public void addMovie(Moviesmodels moviesmodel)
    {
        Movieentity movieentity = new Movieentity(moviesmodel.getName(), moviesmodel.getCategory(), moviesmodel.getProducer(), moviesmodel.getDirector(), moviesmodel.getDate());
        this.movierepo.insert(movieentity);
    }

    public List<Moviesmodels> getallMovies()
    {
        movieentityList= this.movierepo.getmovies();
        return convert_list_model(movieentityList);
    }

    public List<Moviesmodels> get_movie_id(Integer id)
    {
        movieentityList = this.movierepo.filtering_id(id);
        return convert_list_model(movieentityList);

    }

    public List<Moviesmodels> convert_list_model(List<Movieentity> movieentityList)
    {
        return movieentityList.stream().map(
                movie -> new Moviesmodels(movie.getId(), movie.getName(), movie.getCategory(), movie.getProducer(), movie.getDirector(), movie.getDate())).
                collect(Collectors.toList());
    }

    public  void  update_by_id(Moviesmodels moviesmodels, Integer id)
    {
        movieentityList = this.movierepo.filtering_id(id);
        Movieentity movieentity = return_of_object(movieentityList);
        movieentity.setName(moviesmodels.name);
        movieentity.setCategory(moviesmodels.category);
        movieentity.setProducer(moviesmodels.producer);
        movieentity.setDirector(moviesmodels.Director);
        movieentity.setDate(moviesmodels.date);
        this.movierepo.update_rec(movieentity);
    }

    public  void delete_by_id(Integer id)
    {
        movieentityList = this.movierepo.filtering_id(id);
        Movieentity movieentity = return_of_object(movieentityList);
        this.movierepo.delete_rec(movieentity);
    }

    private Movieentity return_of_object(List<Movieentity> movieentityList) {
        for (Movieentity movieentity: movieentityList)
        {
            return movieentity;
        }
        return  null;
    }
}
