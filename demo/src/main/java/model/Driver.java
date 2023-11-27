package model;

public class Driver {

    private String driverName;

    private int id;

   private DriverMetaData driverMetaData;

    public Driver(String driverName, int id, DriverMetaData driverMetaData) {
        this.driverName = driverName;
        this.id = id;
        this.driverMetaData = driverMetaData;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DriverMetaData getDriverMetaData() {
        return driverMetaData;
    }

    public void setDriverMetaData(DriverMetaData driverMetaData) {
        this.driverMetaData = driverMetaData;
    }
}
