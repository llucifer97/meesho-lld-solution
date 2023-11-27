package service;

import dao.CabDao;
import enums.CabAvaibilityStatus;
import model.Cab;
import model.Customer;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class NearestCabSearchEngineImpl implements CabSearchEngine{

    private final CabDao cabDao ;

    public NearestCabSearchEngineImpl(CabDao cabDao) {
        this.cabDao = cabDao;
    }


    @Override
    public Cab findCab(Customer customer) {

        List<Cab> cabArrayList = cabDao.getAllCab();
        cabArrayList = cabArrayList.stream().filter(i -> i.getCabAvaibilityStatus().equals(CabAvaibilityStatus.AVAILABLE)).collect(Collectors.toList());

        int destination = customer.getCustomerMetaData().getLocation().getLocationIndex();
        Cab  cab = null;
        int mindiff = Integer.MAX_VALUE;



        for(int i = 0; i < cabArrayList.size(); i++) {
            int diff = Math.abs(destination - cabArrayList.get(i).getCabCurrentLocation().getLocationIndex());
          if(mindiff > diff) {
                cab = cabArrayList.get(i);
                diff = mindiff;


            }
        }




        return cab;
    }

    @Override
    public Cab findCab(Customer customer, int radius) {
        return null;
    }
}
