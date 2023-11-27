package dto;

import model.Trip;
import service.TripService;

public class CabBookingDetailsDTO {

    private int cabId;
    private int tripId;
    private Trip trip;


    public CabBookingDetailsDTO(int cabId, int tripId , Trip trip) {
        this.cabId = cabId;
        this.tripId = tripId;
        this.trip = trip;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public int getCabId() {
        return cabId;
    }

    public void setCabId(int cabId) {
        this.cabId = cabId;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }
}
