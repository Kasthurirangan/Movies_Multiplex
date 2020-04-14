package service;

import entity.AlotMovieentity;
import entity.Multiplexentity;
import models.Multiplexmodels;
import repositiries.AlotMoviesrepo;
import repositiries.Multiplexrepo;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Singleton
public class Multiplexservice {

    @Inject
    Multiplexrepo multiplexrepo;

    @Inject
    AlotMoviesrepo alotMoviesrepo;

    private static  List<Multiplexentity> multiplexentities = new ArrayList<>();

    private static  List<AlotMovieentity> alotMovieentities = new ArrayList<>();

    private  static  List<AlotMovieentity> alotMovieentityList = new ArrayList<>();

    public void add_multiplex(Multiplexmodels multiplexmodels, List<String> movie_timing)
    {
        Multiplexentity multiplexentity = new Multiplexentity(multiplexmodels.getMultiplexname(), multiplexmodels.getAddress(), multiplexmodels.getNum_of_screens());
        this.multiplexrepo.to_create(multiplexentity);
        for (int i =1; i<=multiplexmodels.num_of_screens; i++)
        {
            for(String j : movie_timing) {
                AlotMovieentity alotMovieentity = new AlotMovieentity(0, multiplexentity.multiplex_id, i,j, "No");
                this.alotMoviesrepo.to_create(alotMovieentity);
            }
        }
    }

    public List<Multiplexmodels> to_display()
    {
        multiplexentities = this.multiplexrepo.to_list();
        return convert_to_model_list(multiplexentities);
    }

    private List<Multiplexmodels> convert_to_model_list(List<Multiplexentity> multiplexentities) {
        return multiplexentities.stream().map(
                multiplex ->
                    new Multiplexmodels(multiplex.getMultiplex_id(), multiplex.getMultiplexname(),multiplex.getAddress(), multiplex.getNum_of_screens()))
                    .collect(Collectors.toList());
    }

    public List<Multiplexmodels> get_movie_id(Integer id) {
        multiplexentities = this.multiplexrepo.filtering_id(id);
        return convert_to_model_list(multiplexentities);
    }

    public void update_by_id(Multiplexmodels multiplexmodels, Integer id, List<String> movie_timing) {
        multiplexentities = this.multiplexrepo.filtering_id(id);
        Multiplexentity multiplexentity = return_of_object(multiplexentities);
        update_by_allocation(multiplexentity, multiplexmodels, movie_timing);
        multiplexentity.setMultiplexname(multiplexmodels.Multiplexname);
        multiplexentity.setAddress(multiplexmodels.address);
        multiplexentity.setNum_of_screens(multiplexmodels.num_of_screens);
        this.multiplexrepo.update_rec(multiplexentity);
    }

    private void update_by_allocation(Multiplexentity multiplexentity, Multiplexmodels multiplexmodels, List<String> movie_timing) {
        if (multiplexentity.num_of_screens < multiplexmodels.num_of_screens)
        {
            int difference_made = multiplexmodels.num_of_screens - multiplexentity.num_of_screens;
            for (int i = 1; i<=difference_made; i++)
            {
                for(String j : movie_timing) {
                    AlotMovieentity alotMovieentity = new AlotMovieentity(0, 0, multiplexentity.num_of_screens + i,j, "No");
                    this.alotMoviesrepo.to_create(alotMovieentity);
                }
            }
        }
        else if (multiplexentity.num_of_screens == multiplexmodels.num_of_screens)
        {
            System.out.println("they are equal");
        }
        else
        {
            for (int i = multiplexentity.num_of_screens; i<=multiplexmodels.num_of_screens; i--)
            {
                alotMovieentities = this.alotMoviesrepo.filtering_id_screens(i);
                List<AlotMovieentity> alotMovieentityList = return_of_object_movie(alotMovieentities);
                for (AlotMovieentity alotMovieentity: alotMovieentityList) {
                    this.alotMoviesrepo.delete_rec(alotMovieentity);
                }
            }
        }
    }

    private Multiplexentity return_of_object(List<Multiplexentity> multiplexentities) {
        for (Multiplexentity multiplexentity: multiplexentities)
        {
            return multiplexentity;
        }
        return  null;
    }

    public void delete_by_id(Integer id) {
        multiplexentities = this.multiplexrepo.filtering_id(id);
        Multiplexentity multiplexentity = return_of_object(multiplexentities);
        this.multiplexrepo.delete_rec(multiplexentity);
        alotMovieentities = this.alotMoviesrepo.filtering_id(id);
        List<AlotMovieentity> alotMovieentityList = return_of_object_movie(alotMovieentities);
        for (AlotMovieentity alotMovieentity: alotMovieentityList) {
            this.alotMoviesrepo.delete_rec(alotMovieentity);
        }
    }

    private List<AlotMovieentity> return_of_object_movie(List<AlotMovieentity> alotMovieentities) {
        for (AlotMovieentity alotMovieentity: alotMovieentities)
        {
            alotMovieentityList.add(alotMovieentity);
        }
        return  alotMovieentityList;
    }
}
