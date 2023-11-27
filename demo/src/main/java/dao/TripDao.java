package dao;

import model.Trip;

import java.util.ArrayList;

public class TripDao {

    private ArrayList<Trip> trips = new ArrayList<>();

    public void saveTrip(Trip trip) {
        trips.add(trip);
    }
}
