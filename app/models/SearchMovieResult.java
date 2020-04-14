package models;

public class SearchMovieResult {

    public int id;
    public String name;
    public String category;
    public String producer;
    public String Director;
    public String date;
    public String multiplex_name;
    public String time_range;
    public int screen_no;

    public SearchMovieResult(){}

    public SearchMovieResult(int id, String name, String category, String producer, String Director, String date, String multiplex_name, String time_range, int screen_no)
    {
        this.id = id;
        this.name = name;
        this.category = category;
        this.producer = producer;
        this.Director = Director;
        this.date = date;
        this.multiplex_name = multiplex_name;
        this.time_range = time_range;
        this.screen_no = screen_no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMultiplex_name() {
        return multiplex_name;
    }

    public void setMultiplex_name(String multiplex_name) {
        this.multiplex_name = multiplex_name;
    }

    public String getTime_range() {
        return time_range;
    }

    public void setTime_range(String time_range) {
        this.time_range = time_range;
    }

    public int getScreen_no() {
        return screen_no;
    }

    public void setScreen_no(int screen_no) {
        this.screen_no = screen_no;
    }
}
