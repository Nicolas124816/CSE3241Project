package Entities.Superclasses;

import java.util.Date;
import java.util.UUID;

public class Item {
    private UUID inventoryID;
    private Date expDate;
    private String description;
    private String manufacturer;
    private int modelNumber;
    private int year;
    private int serialNumber;
    
    public UUID getInventoryID() {
        return inventoryID;
    }
    public void setInventoryID(UUID inventoryID) {
        this.inventoryID = inventoryID;
    }
    public Date getExpDate() {
        return expDate;
    }
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public int getModelNumber() {
        return modelNumber;
    }
    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    

}
