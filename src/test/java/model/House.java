package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class House {
    private Address address;
    private int nr;
    private List<Flat> flats;


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public void setFlats(List<Flat> flats) {
        this.flats = flats;
    }
    public void printHouseDetails(){
        System.out.println("Address:" + getAddress().getStreet() +
                " " + getAddress().getHouseNr() + "," + getAddress().getCity() + " :: Flats amount: " + flats.size());
    }
}