package Entities;

import java.util.Date;

public class Order {
    private int orderNumber;
    private String description;
    private String elementType;
    private int numItems;
    private Date orderDate;

    public int getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getElementType() {
        return this.elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public int getNumItems() {
        return this.numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }

    public Date getOrderDate() {
        return this.orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

}
