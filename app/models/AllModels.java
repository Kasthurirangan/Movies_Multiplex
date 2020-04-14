package models;

import java.util.List;

public class AllModels {

    List<Alotmoviemodel> alotmoviemodelList;

    List<Moviesmodels> moviesmodelsList;

    List<Multiplexmodels> multiplexmodelsList;

    List<SearchMovieResult> searchMovieResultList;

    List<SearchMultiplexResult> searchMultiplexResultList;

    AllModels(List<Alotmoviemodel> alotmoviemodelList, List<Moviesmodels> moviesmodelsList, List<Multiplexmodels> multiplexmodelsList, List<SearchMovieResult> searchMovieResultList, List<SearchMultiplexResult> searchMultiplexResultList)
    {
        this.alotmoviemodelList = alotmoviemodelList;
        this.moviesmodelsList = moviesmodelsList;
        this.multiplexmodelsList = multiplexmodelsList;
        this.searchMovieResultList = searchMovieResultList;
        this.searchMultiplexResultList = searchMultiplexResultList;
    }

    public List<Alotmoviemodel> getAlotmoviemodelList() {
        return alotmoviemodelList;
    }

    public void setAlotmoviemodelList(List<Alotmoviemodel> alotmoviemodelList) {
        this.alotmoviemodelList = alotmoviemodelList;
    }

    public List<Moviesmodels> getMoviesmodelsList() {
        return moviesmodelsList;
    }

    public void setMoviesmodelsList(List<Moviesmodels> moviesmodelsList) {
        this.moviesmodelsList = moviesmodelsList;
    }

    public List<Multiplexmodels> getMultiplexmodelsList() {
        return multiplexmodelsList;
    }

    public void setMultiplexmodelsList(List<Multiplexmodels> multiplexmodelsList) {
        this.multiplexmodelsList = multiplexmodelsList;
    }

    public List<SearchMovieResult> getSearchMovieResultList() {
        return searchMovieResultList;
    }

    public void setSearchMovieResultList(List<SearchMovieResult> searchMovieResultList) {
        this.searchMovieResultList = searchMovieResultList;
    }

    public List<SearchMultiplexResult> getSearchMultiplexResultList() {
        return searchMultiplexResultList;
    }

    public void setSearchMultiplexResultList(List<SearchMultiplexResult> searchMultiplexResultList) {
        this.searchMultiplexResultList = searchMultiplexResultList;
    }
}
