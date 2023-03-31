package Entities;

import java.util.List;

import Entities.Superclasses.Person;

public class Member extends Person {
    private String startDate;
    private List<Double> warehouseDistances;
    private int userID;

    public Member(String firstName, String lastName, String address,
            String phone, String email, String startDate,
            List<Double> warehouseDistances, int userID) {
        super(firstName, lastName, address, phone, email);
        this.startDate = startDate;
        this.warehouseDistances = warehouseDistances;
        this.userID = userID;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public List<Double> getWarehouseDistances() {
        return this.warehouseDistances;
    }

    public void setWarehouseDistances(List<Double> warehouseDistances) {
        this.warehouseDistances = warehouseDistances;
    }

    public int getUserID() {
        return this.userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        String person = super.toString();
        person += "\nStart Date: " + this.startDate + "\nWarehouse Distances: "
                + this.warehouseDistances + "\nUser ID: " + this.userID;
        return person;
    }

}
