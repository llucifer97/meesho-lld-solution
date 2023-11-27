package model;

public class DriverMetaData {
    private int id;


    private int earnings ;


    public DriverMetaData(int id, int earnings) {
        this.id = id;
        this.earnings = earnings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEarnings() {
        return earnings;
    }

    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }
}
