package model;

public class Customer {
    private int id;
    private String name;

    private CustomerMetaData customerMetaData;

    public Customer(int id, String name, CustomerMetaData customerMetaData) {
        this.id = id;
        this.name = name;
        this.customerMetaData = customerMetaData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerMetaData getCustomerMetaData() {
        return customerMetaData;
    }

    public void setCustomerMetaData(CustomerMetaData customerMetaData) {
        this.customerMetaData = customerMetaData;
    }
}
