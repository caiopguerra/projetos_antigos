package com.Dto;

public class racersDto {
    public String name;
    public String team;
    
    
    public racersDto(String name, String team) {
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
    public String setTeam() {
        return this.team = team;
    }

    @Override
    public String toString() {
        return "racersDto [name=" + name + ", team=" + team + "]";
    }
    
}
