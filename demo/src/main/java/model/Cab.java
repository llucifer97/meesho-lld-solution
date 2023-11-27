package model;

import enums.CabAvaibilityStatus;

public class Cab {

    private int id;

    private String cabNumber;

    private Driver driver;

    private Location cabCurrentLocation;

    private CabAvaibilityStatus cabAvaibilityStatus;

    public Cab(int id, String cabNumber, Driver driver, Location cabCurrentLocation, CabAvaibilityStatus cabAvaibilityStatus) {
        this.id = id;
        this.cabNumber = cabNumber;
        this.driver = driver;
        this.cabCurrentLocation = cabCurrentLocation;
        this.cabAvaibilityStatus = cabAvaibilityStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCabNumber() {
        return cabNumber;
    }

    public void setCabNumber(String cabNumber) {
        this.cabNumber = cabNumber;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Location getCabCurrentLocation() {
        return cabCurrentLocation;
    }

    public void setCabCurrentLocation(Location cabCurrentLocation) {
        this.cabCurrentLocation = cabCurrentLocation;
    }

    public CabAvaibilityStatus getCabAvaibilityStatus() {
        return cabAvaibilityStatus;
    }

    public void setCabAvaibilityStatus(CabAvaibilityStatus cabAvaibilityStatus) {
        this.cabAvaibilityStatus = cabAvaibilityStatus;
    }
}
