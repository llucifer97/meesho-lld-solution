package service;

import dao.CabDao;
import dto.CabBookingDetailsDTO;
import enums.CabAvaibilityStatus;
import model.Cab;
import model.Customer;
import model.Location;
import model.Trip;

public class CabService {

    private final CabSearchEngine cabSearchEngine ;
    private final TripService tripService;
    private final CabDao cabDao;

    public CabService(CabSearchEngine cabSearchEngine, TripService tripService, CabDao cabDao) {
        this.cabSearchEngine = cabSearchEngine;
        this.tripService = tripService;
        this.cabDao = cabDao;
    }

    public CabBookingDetailsDTO bookCab(Customer customer , Location destination) {


        Cab cab =  cabSearchEngine.findCab(customer);

        // block the cab
        cab.setCabAvaibilityStatus(CabAvaibilityStatus.BOOKED);

        Trip trip = tripService.createTrip(customer,cab , destination);

        System.out.println("tripid : " + trip.getId() + " Cabid : " + cab.getId());

        return new CabBookingDetailsDTO(cab.getId() , trip.getId() , trip);

    }



    public void createCab(Cab cab) {
        cabDao.saveCab(cab);
    }

}
