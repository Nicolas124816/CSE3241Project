package Entities.Superclasses;

import java.util.Date;
import java.util.UUID;

public class Item {
    private int inventoryID;
    private String expDate;
    private String description;
    private String manufacturer;
    private int modelNumber;
    private int year;
    private int serialNumber;

    

    public Item(int inventoryID, String expDate, String description, String manufacturer, int modelNumber, int year,
            int serialNumber) {
        this.inventoryID = inventoryID;
        this.expDate = expDate;
        this.description = description;
        this.manufacturer = manufacturer;
        this.modelNumber = modelNumber;
        this.year = year;
        this.serialNumber = serialNumber;
    }

    public Item(Item copy) {
        this.inventoryID = copy.inventoryID;
        this.expDate = copy.expDate;
        this.description = copy.description;
        this.manufacturer = copy.manufacturer;
        this.modelNumber = copy.modelNumber;
        this.year = copy.year;
        this.serialNumber = copy.serialNumber;
    }
    
    public int getInventoryID() {
        return inventoryID;
    }
    public void setInventoryID(int inventoryID) {
        this.inventoryID = inventoryID;
    }
    public String getExpDate() {
        return expDate;
    }
    public void setExpDate(String expDate) {
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
