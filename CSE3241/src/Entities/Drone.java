package Entities;

import Entities.Superclasses.Item;

public class Drone extends Item {
    private int fleetID;
    private double weightCapacity;
    private double volumeCapacity;
    private double distanceAutonomy;
    private double maxSpeed;
    private String status;
    public int getFleetID() {
        return fleetID;
    }
    public void setFleetID(int fleetID) {
        this.fleetID = fleetID;
    }
    public double getWeightCapacity() {
        return weightCapacity;
    }
    public void setWeightCapacity(double weightCapacity) {
        this.weightCapacity = weightCapacity;
    }
    public double getVolumeCapacity() {
        return volumeCapacity;
    }
    public void setVolumeCapacity(double volumeCapacity) {
        this.volumeCapacity = volumeCapacity;
    }
    public double getDistanceAutonomy() {
        return distanceAutonomy;
    }
    public void setDistanceAutonomy(double distanceAutonomy) {
        this.distanceAutonomy = distanceAutonomy;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    
}
