package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Multiplexentity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int multiplex_id;

    public String Multiplexname;
    public String address;
    public int num_of_screens;

    public Multiplexentity(){}

    public Multiplexentity(String Multiplexname, String address, int num_of_screens)
    {
        this.Multiplexname = Multiplexname;
        this.address = address;
        this.num_of_screens = num_of_screens;
    }

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
}
