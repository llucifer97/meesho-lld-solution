package dao;

import model.Customer;

import java.util.ArrayList;

public class CustomerDao {

    ArrayList<Customer> customerArrayList = new ArrayList<>();

    public void saveCustomer(Customer customer) {
        customerArrayList.add(customer);
    }


}
