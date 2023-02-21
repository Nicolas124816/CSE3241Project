package Entities;

import java.util.Date;
import java.util.List;

import Entities.Superclasses.Person;

public class Member extends Person {
    private Date startDate;
    private List<Double> warehouseDistances;
    private String userID;
    
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
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

    
    
}
