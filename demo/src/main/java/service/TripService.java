package service;

import dao.TripDao;
import enums.CabAvaibilityStatus;
import enums.TripStatus;
import model.*;

import java.util.UUID;

public class TripService {

    private final TripDao tripDao;

    public TripService(TripDao tripDao) {
        this.tripDao = tripDao;
    }


    public Trip createTrip(Customer customer, Cab cab , Location destination) {

        Trip trip = new Trip();
        trip.setCab(cab);
        trip.setTripStatus(TripStatus.INITIATED);
        trip.setCustomer(customer);
        trip.setId(UUID.randomUUID().variant());
        trip.setDate(UUID.randomUUID().variant());
        trip.setEnd(destination);
        trip.setStart(customer.getCustomerMetaData().getLocation());

        tripDao.saveTrip(trip);

        return trip;

    }


    public Trip endRide(Trip trip) {

        // end trip
        trip.setTripStatus(TripStatus.COMPLETED);



        // pay to driver
        int total = trip.getCab().getDriver().getDriverMetaData().getEarnings() + Math.abs(trip.getStart().getLocationIndex() - trip.getEnd().getLocationIndex())*10;


        // unblock cab
        trip.getCab().setCabAvaibilityStatus(CabAvaibilityStatus.AVAILABLE);

        System.out.println("driverid : " + trip.getCab().getDriver().getId() + " pickup : " + trip.getStart().getLocationIndex() + " drop point : " + trip.getEnd().getLocationIndex() + "fair : " + total );

        return trip;

    }


    public void saveTrip(Trip trip) {
        tripDao.saveTrip(trip);

    }


}
