package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Moviesmodels {

        public  int id;
        public String name;
        public String category;
        public String producer;
        public String Director;
        public String date;

         public List<Moviesmodels> moviesmodelsList = new ArrayList<>();

        public Moviesmodels(){}

        public Moviesmodels(int id, String name, String category, String producer, String Director, String date)
        {
            this.id = id;
            this.name = name;
            this.category = category;
            this.producer = producer;
            this.Director = Director;
            this.date = date;
        }

        public Moviesmodels(String name, String category, String producer, String director, String date)
        {
            this.name = name;
            this.category = category;
            this.producer = producer;
            this.Director = director;
            this.date = date;
        }

        public static Moviesmodels list_to_edit(List<Moviesmodels> moviesmodellist)
        {
            for(Moviesmodels moviesmodels : moviesmodellist)
            {
                return moviesmodels;
            }
            return  null;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getCategory() {
            return category;
        }

        public String getProducer() {
            return producer;
        }

        public String getDirector() {
            return Director;
        }

        public String getDate() {
            return date;
        }
    }
