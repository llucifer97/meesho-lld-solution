import dao.CabDao;
import dao.CustomerDao;
import dao.TripDao;
import dto.CabBookingDetailsDTO;
import enums.CabAvaibilityStatus;
import model.*;
import service.CabSearchEngine;
import service.CabService;
import service.NearestCabSearchEngineImpl;
import service.TripService;

public class Main {


    public static void main(String[] args) {


        TripDao tripDao = new TripDao();
        CabDao cabDao = new CabDao();
        CustomerDao customerDao = new CustomerDao();
        CabSearchEngine cabSearchEngine = new NearestCabSearchEngineImpl(cabDao);

        TripService tripService = new TripService(tripDao);
        CabService cabService = new CabService(cabSearchEngine ,tripService , cabDao );

        // make cab

        Cab cab1 = new Cab(1,"123" , new Driver("mahesh" ,1 , new DriverMetaData(1,0)) , new Location(1) , CabAvaibilityStatus.AVAILABLE);
        Cab cab2 = new Cab(2,"234" , new Driver("roy" ,2 , new DriverMetaData(2,0)) , new Location(2) , CabAvaibilityStatus.AVAILABLE);
        Cab cab3 = new Cab(3,"890" , new Driver("ayush" ,3 , new DriverMetaData(3,0)) , new Location(5) , CabAvaibilityStatus.AVAILABLE);

        cabDao.saveCab(cab1);
        cabDao.saveCab(cab2);
        cabDao.saveCab(cab3);



        // make customer
        Customer customer1 = new Customer(1,"cus1" , new CustomerMetaData(1 , new Location(4) , 0));
        Customer customer2 = new Customer(2,"cus2" , new CustomerMetaData(2 , new Location(5) , 0));

        customerDao.saveCustomer(customer1);
        customerDao.saveCustomer(customer2);




        // book a cab trip



        CabBookingDetailsDTO cabBookingDetailsDTO =  cabService.bookCab(customer1, new Location(1));



        // end ride
        tripService.endRide(cabBookingDetailsDTO.getTrip());

    }

}

