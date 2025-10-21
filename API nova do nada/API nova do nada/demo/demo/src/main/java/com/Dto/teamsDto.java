package com.Dto;

import com.model.racers;

public class teamsDto {
    private String name;
    private racers racer1;
    private racers racer2;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "teamsDto [name=" + name + ", racer1=" + racer1 + ", racer2=" + racer2 + "]";
    }
}
