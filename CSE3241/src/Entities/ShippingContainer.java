package Entities;

import java.util.UUID;

public class ShippingContainer {
    private double volume;
    private double weight;
    private String material;
    private double cost;
    private UUID packageID;
    
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public UUID getPackageID() {
        return packageID;
    }
    public void setPackageID(UUID packageID) {
        this.packageID = packageID;
    }

    

}
