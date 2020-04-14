package models;


public class Searchmodel {

    String search_value;
    Integer multiplex_movie;

    public Searchmodel(){}

    public Searchmodel(String search_value, Integer multiplex_movie)
    {
        this.search_value = search_value;
        this.multiplex_movie = multiplex_movie;
    }

    public String getSearch_value() {
        return search_value;
    }

    public void setSearch_value(String search_value) {
        this.search_value = search_value;
    }

    public Integer getMultiplex_movie() {
        return multiplex_movie;
    }

    public void setMultiplex_movie(Integer multiplex_movie) {
        this.multiplex_movie = multiplex_movie;
    }
}
