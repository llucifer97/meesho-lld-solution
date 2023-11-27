package service;

import model.Cab;
import model.Customer;

public interface CabSearchEngine {

    Cab findCab(Customer customer);
    Cab findCab(Customer customer , int radius);
}
