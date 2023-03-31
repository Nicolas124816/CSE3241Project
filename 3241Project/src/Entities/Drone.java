package Entities;

import Entities.Superclasses.Item;

public class Drone extends Item {
    private int fleetID;
    private double weightCapacity;
    private double volumeCapacity;
    private double distanceAutonomy;
    private double maxSpeed;
    private String status;

    public Drone(Item item) {
        super(item);
    }

    public int getFleetID() {
        return this.fleetID;
    }

    public void setFleetID(int fleetID) {
        this.fleetID = fleetID;
    }

    public double getWeightCapacity() {
        return this.weightCapacity;
    }

    public void setWeightCapacity(double weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    public double getVolumeCapacity() {
        return this.volumeCapacity;
    }

    public void setVolumeCapacity(double volumeCapacity) {
        this.volumeCapacity = volumeCapacity;
    }

    public double getDistanceAutonomy() {
        return this.distanceAutonomy;
    }

    public void setDistanceAutonomy(double distanceAutonomy) {
        this.distanceAutonomy = distanceAutonomy;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
