package com.model;

import javax.persistence.Entity;

@Entity
public class raceSetup {
    private String GP;
    private int laps;
    private String track;

    
    public String getGP() {
        return GP;
    }
    public void setGP(String gP) {
        GP = gP;
    }
    public int getLaps() {
        return laps;
    }
    public void setLaps(int laps) {
        this.laps = laps;
    }
    public String getTrack() {
        return track;
    }
    public void setTrack(String track) {
        this.track = track;
    }

}
