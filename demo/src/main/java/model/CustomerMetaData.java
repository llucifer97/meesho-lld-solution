package model;

public class CustomerMetaData {
    private int id;
    private Location location;
    private int numberOfTripsCompleted;

    public CustomerMetaData(int id, Location location, int numberOfTripsCompleted) {
        this.id = id;
        this.location = location;
        this.numberOfTripsCompleted = numberOfTripsCompleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getNumberOfTripsCompleted() {
        return numberOfTripsCompleted;
    }

    public void setNumberOfTripsCompleted(int numberOfTripsCompleted) {
        this.numberOfTripsCompleted = numberOfTripsCompleted;
    }
}
