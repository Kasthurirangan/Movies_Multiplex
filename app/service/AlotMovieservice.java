package service;

import entity.AlotMovieentity;
import models.Alotmoviemodel;
import repositiries.AlotMoviesrepo;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
public class AlotMovieservice {

    @Inject
    AlotMoviesrepo alotMoviesrepo;

    private List<AlotMovieentity> alotMovieentityList = new ArrayList<>();

    private  List<AlotMovieentity> getAlotMovieentityList = new ArrayList<>();

    public List<Alotmoviemodel> to_display()
    {
        alotMovieentityList = this.alotMoviesrepo.to_list("yes");
        return convert_to_model_list(alotMovieentityList);
    }

    public List<Alotmoviemodel> to_check_allocation_possible(Integer screen_num, String timing, int multiplex_id, int movie_id)
    {
        String value = "No";
        alotMovieentityList = this.alotMoviesrepo.check_rec(screen_num, timing, multiplex_id, value);
        if (!alotMovieentityList.isEmpty())
        {
            AlotMovieentity alotMovieentity = return_of_object(alotMovieentityList);
            alotMovieentity.setMovie_id(movie_id);
            alotMovieentity.setAloted_or_not("yes");
            this.alotMoviesrepo.update_rec(alotMovieentity);
            getAlotMovieentityList = this.alotMoviesrepo.filtering_id_movie_alloc_id(alotMovieentity.getMovieallocation_id());
            return convert_to_model_list(getAlotMovieentityList);
        }
        return convert_to_model_list(alotMovieentityList);
    }

    private AlotMovieentity return_of_object(List<AlotMovieentity> alotMovieentityList) {
        for (AlotMovieentity alotMovieentity: alotMovieentityList)
        {
            return alotMovieentity;
        }
        return  null;
    }

    private List<Alotmoviemodel> convert_to_model_list(List<AlotMovieentity> alotMovieentityList) {
        return alotMovieentityList.stream().map(
                alotmovie ->
                        new Alotmoviemodel
                                (alotmovie.getMovieallocation_id(), alotmovie.getMovie_id(),alotmovie.getMutiplex_id(), alotmovie.getScreen_no(), alotmovie.timerange, alotmovie.getAloted_or_not()))
                .collect(Collectors.toList());
    }
}
