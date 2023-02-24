package Entities;

import java.util.List;

import Entities.Superclasses.Person;

public class Member extends Person {
    private String startDate;
    private List<Double> warehouseDistances;
    private String userID;
    
    public Member(String firstName, String lastName, String address, String phone, String email, String startDate, List<Double> warehouseDistances, String userID) {
        super(firstName, lastName, address, phone, email);
        this.startDate = startDate;
        this.warehouseDistances = warehouseDistances;
        this.userID = userID;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public List<Double> getWarehouseDistances() {
        return warehouseDistances;
    }
    public void setWarehouseDistances(List<Double> warehouseDistances) {
        this.warehouseDistances = warehouseDistances;
    }
    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        String person = super.toString();
        person += "\nStart Date: " + startDate + "\nWarehouse Distances: " + warehouseDistances + "\nUser ID: " + userID;
        return person;
    }
    
}
