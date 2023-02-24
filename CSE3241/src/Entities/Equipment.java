package Entities;

import java.util.Date;
import java.util.List;

import Entities.Superclasses.Item;

public class Equipment extends Item {
    private String type;
    private String arrivalDate;
    private double weight;
    private List<String> sizes;
    
    

    public Equipment(Item item, String type, String arrivalDate, double weight, List<String> sizes) {
        super(item);
        this.type = type;
        this.arrivalDate = arrivalDate;
        this.weight = weight;
        this.sizes = sizes;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getArrivalDate() {
        return arrivalDate;
    }
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public List<String> getSizes() {
        return sizes;
    }
    public void setSizes(List<String> sizes) {
        this.sizes = sizes;
    }

    
}
