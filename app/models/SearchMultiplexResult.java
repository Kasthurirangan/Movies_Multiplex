package models;

public class SearchMultiplexResult {

    public int multiplex_id;
    public String Multiplexname;
    public String address;
    public int num_of_screens;
    public String name;
    public int screen_no;
    public String timerange;

    public int getMultiplex_id() {
        return multiplex_id;
    }

    public void setMultiplex_id(int multiplex_id) {
        this.multiplex_id = multiplex_id;
    }

    public String getMultiplexname() {
        return Multiplexname;
    }

    public void setMultiplexname(String multiplexname) {
        Multiplexname = multiplexname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNum_of_screens() {
        return num_of_screens;
    }

    public void setNum_of_screens(int num_of_screens) {
        this.num_of_screens = num_of_screens;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScreen_no() {
        return screen_no;
    }

    public void setScreen_no(int screen_no) {
        this.screen_no = screen_no;
    }

    public String getTimerange() {
        return timerange;
    }

    public void setTimerange(String timerange) {
        this.timerange = timerange;
    }

    public SearchMultiplexResult(int multiplex_id, String Multiplexname, String address, int num_of_screens, String name, int screen_no, String timerange)
    {
        this.multiplex_id = multiplex_id;
        this.Multiplexname = Multiplexname;
        this.address = address;
        this.num_of_screens = num_of_screens;
        this.name = name;
        this.screen_no = screen_no;
        this.timerange = timerange;
    }

    public SearchMultiplexResult() {}

}
