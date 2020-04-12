package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Alotmoviemodel {

        public int movieallocation_id;

        public int movie_id;
        public int mutiplex_id;
        public int screen_no;
        public String timerange;
        public String aloted_or_not;

        public Alotmoviemodel( int movieallocation_id, int movie_id, int mutiplex_id, int screen_no, String timerange, String aloted_or_not)
        {
            this.movieallocation_id = movieallocation_id;
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
    }
