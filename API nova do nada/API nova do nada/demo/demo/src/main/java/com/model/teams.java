package com.model;

import javax.persistence.Entity;

@Entity
public class teams {

    private String name;
    private String country;
    private racers racer1;
    private racers racer2;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public racers getRacer1() {
        return racer1;
    }
    public void setRacer1(racers racer1) {
        this.racer1 = racer1;
    }
    public racers getRacer2() {
        return racer2;
    }
    public void setRacer2(racers racer2) {
        this.racer2 = racer2;
    }
    
}
