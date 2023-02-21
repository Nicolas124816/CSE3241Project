package Entities;

import java.util.UUID;

public class Warehouse {
    private UUID warehouseID;
    private String city;
    private String address;
    private int phone;
    private String managerName;
    //calculated attributes:
    //storageCapacity
    //droneCapacity
    public UUID getWarehouseID() {
        return warehouseID;
    }
    public void setWarehouseID(UUID warehouseID) {
        this.warehouseID = warehouseID;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public String getManagerName() {
        return managerName;
    }
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
    
    //TODO: methods for calculating the derived attributes mentioned above

    
}
