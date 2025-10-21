package com.model;

import java.util.List;

import javax.persistence.Entity;

import com.Dto.racersDto;

@Entity
public class racers {
    
    public static Long getNumber;
    public String name;
    public String team;
    private int number;
    private String hamletColor;



    public racers(racersDto dados2) {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getHamletColor() {
        return hamletColor;
    }
    public void setHamletColor(String hamletColor) {
        this.hamletColor = hamletColor;
    }
}

