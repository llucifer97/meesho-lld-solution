package dao;

import model.Cab;

import java.util.ArrayList;

public class CabDao {

    private ArrayList<Cab> cabs = new ArrayList<>();


    public void saveCab(Cab cab) {
        cabs.add(cab);
    }

    public ArrayList<Cab> getAllCab() {
        return cabs;
    }
}
