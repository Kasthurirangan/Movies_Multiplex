package models;

import java.util.List;

public class Multiplexmodels {

    public int multiplex_id;
    public String Multiplexname;
    public String address;
    public int num_of_screens;

    public  Multiplexmodels(){}

    public Multiplexmodels(int multiplex_id, String Multiplexname, String address, int num_of_screens)
    {
        this.multiplex_id = multiplex_id;
        this.Multiplexname = Multiplexname;
        this.address = address;
        this.num_of_screens = num_of_screens;
    }

    public Multiplexmodels(String multiplexname, String address, int no_of_screen) {
        this.Multiplexname = multiplexname;
        this.address = address;
        this.num_of_screens = no_of_screen;
    }

    public static Multiplexmodels list_to_edit(List<Multiplexmodels> multiplexmodelsList) {
        for(Multiplexmodels multiplexmodels : multiplexmodelsList)
        {
            return multiplexmodels;
        }
        return  null;
    }

    public int getMultiplex_id() {
        return multiplex_id;
    }

    public String getMultiplexname() {
        return Multiplexname;
    }

    public String getAddress() {
        return address;
    }

    public int getNum_of_screens() {
        return num_of_screens;
    }
}
