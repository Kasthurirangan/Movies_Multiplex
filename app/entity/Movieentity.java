package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movieentity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public  int id;

    public String name;

    public String category;

    public String producer;

    public String Director;

    public String date;

    public Movieentity(){}

    public Movieentity(String name, String category, String producer, String Director, String date)
    {
        this.name = name;
        this.category = category;
        this.producer = producer;
        this.Director = Director;
        this.date = date;
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
}
