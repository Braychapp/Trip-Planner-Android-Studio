package com.example.tripplanner;


public class Trip {
    private String startLocation;
    private String endLocation;
    private String date;

    public Trip(String startLocation, String endLocation, String date) {
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.date = date;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDestination() {
        return endLocation;
    }
}
