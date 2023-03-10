package Entities;


public class Warehouse {
    private int warehouseID;
    private String city;
    private String address;
    private String phone;
    private String managerName;
    //calculated attributes:
    //storageCapacity
    //droneCapacity
    
    public Warehouse(int warehouseID, String city, String address, String phone, String managerName) {
        this.warehouseID = warehouseID;
        this.city = city;
        this.address = address;
        this.phone = phone;
        this.managerName = managerName;
    }
    public int getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(int warehouseID) {
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
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getManagerName() {
        return managerName;
    }
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
    
    @Override
    public String toString() {
        String warehouse = "Warehouse ID: " + warehouseID + "\nWarehouse city: " + city + "\nWarehouse addess: " + address 
        + "\nWarehouse phone number: " + phone + "\nManager name: " + managerName;
        return warehouse;
    }
    //TODO: methods for calculating the derived attributes mentioned above

    
}
