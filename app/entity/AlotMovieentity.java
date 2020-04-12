package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AlotMovieentity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int movieallocation_id;

    public int movie_id;
    public int mutiplex_id;
    public int screen_no;
    public String timerange;
    public String aloted_or_not;

    public  AlotMovieentity() {}

    public AlotMovieentity(int movie_id, int mutiplex_id, int screen_no, String timerange, String aloted_or_not)
    {
        this.movie_id = movie_id;
        this.mutiplex_id = mutiplex_id;
        this.screen_no = screen_no;
        this.timerange = timerange;
        this.aloted_or_not = aloted_or_not;
    }

    public int getMovieallocation_id() {
        return movieallocation_id;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public int getMutiplex_id() {
        return mutiplex_id;
    }

    public int getScreen_no() {
        return screen_no;
    }

    public String getTimerange() {
        return timerange;
    }

    public String getAloted_or_not() {
        return aloted_or_not;
    }

    public void setMovieallocation_id(int movieallocation_id) {
        this.movieallocation_id = movieallocation_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public void setMutiplex_id(int mutiplex_id) {
        this.mutiplex_id = mutiplex_id;
    }

    public void setScreen_no(int screen_no) {
        this.screen_no = screen_no;
    }

    public void setTimerange(String timerange) {
        this.timerange = timerange;
    }

    public void setAloted_or_not(String aloted_or_not) {
        this.aloted_or_not = aloted_or_not;
    }
}
