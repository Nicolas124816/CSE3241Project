package Entities;

public class ShippingContainer {
    private double volume;
    private double weight;
    private String material;
    private double cost;
    private int packageID;

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getPackageID() {
        return this.packageID;
    }

    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }

}
