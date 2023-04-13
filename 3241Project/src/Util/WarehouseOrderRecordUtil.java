package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Input.DateHelper;
import cse3241.DBConnection;

public class WarehouseOrderRecordUtil {

    public static void addRecord(Scanner scan) {
        System.out.println("Enter the order number: ");
        int orderNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the warehouse id: ");
        int warehouseId = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the element type: ");
        String elementType = scan.nextLine();
        System.out.println("Enter the number of items: ");
        int numItems = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the cost: ");
        int cost = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the E.T.A: ");
        String etaDate = scan.nextLine();
        System.out.println("Enter the description: ");
        String description = scan.nextLine();

        Connection conn = DBConnection.conn;
        try {

            PreparedStatement stmt1 = conn.prepareStatement(
                    "INSERT INTO Warehouse_Order values (?, ?, ?, ?, ?, ?, ?)");
            stmt1.setInt(1, orderNumber);
            stmt1.setInt(2, warehouseId);
            stmt1.setString(3, elementType);
            stmt1.setInt(4, numItems);
            stmt1.setInt(5, cost);
            stmt1.setDate(6, DateHelper.getDate(etaDate));
            stmt1.setString(7, description);
            stmt1.execute();

            System.out.println("Added new warehouse order with order number: " + orderNumber);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void deleteRecord(Scanner scan) {
        System.out.println("Enter the order number of the warehouse order to delete: ");
        int orderNumber = scan.nextInt();
        scan.nextLine();
        try {
            PreparedStatement stmt1 = DBConnection.conn
                    .prepareStatement("DELETE FROM Warehouse_Order WHERE order_number=?;");
            stmt1.setInt(1, orderNumber);
            stmt1.execute();

            System.out.println("Deleted warehouse order with order number: " + orderNumber);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateRecord(Scanner scan) {
        System.out.println("Enter the order number of the warehouse order to update: ");
        int orderNumberOld = scan.nextInt();
        scan.nextLine();
        System.out.println("Specify new values for the record: ");
        System.out.println("Enter the order number: ");
        int orderNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the warehouse id: ");
        int warehouseId = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the element type: ");
        String elementType = scan.nextLine();
        System.out.println("Enter the number of items: ");
        int numItems = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the cost: ");
        int cost = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the E.T.A: ");
        String etaDate = scan.nextLine();
        System.out.println("Enter the description: ");
        String description = scan.nextLine();

        try {
            PreparedStatement stmt1 = DBConnection.conn.prepareStatement(
                    "UPDATE Warehouse_Order values (?, ?, ?, ?, ?, ?, ?) WHERE order_number=?");
            stmt1.setInt(1, orderNumber);
            stmt1.setInt(2, warehouseId);
            stmt1.setString(3, elementType);
            stmt1.setInt(4, numItems);
            stmt1.setInt(5, cost);
            stmt1.setDate(6, DateHelper.getDate(etaDate));
            stmt1.setString(7, description);
            stmt1.setInt(8, orderNumberOld);
            stmt1.execute();

            System.out.println("Updated warehouse order with order number: " + orderNumber);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void searchRecord(Scanner scan) {
        System.out.println("Enter the order number of the warehouse order to delete: ");
        int orderNumber = scan.nextInt();
        scan.nextLine();

        Connection conn = DBConnection.conn;
        try {
            
            PreparedStatement stmt1 = conn.prepareStatement(
                    "SELECT * FROM Warehouse_Order WHERE order_number=?");
            stmt1.setInt(1, orderNumber);
            ResultSet rSet = stmt1.executeQuery();
            rSet.next();
            int warehouseId = rSet.getInt("warehouse_id");
            String elementType = rSet.getString("element_type");
            int numItems = rSet.getInt("num_items");
            int cost = rSet.getInt("cost");
            String eta = rSet.getString("eta");
            String description = rSet.getString("description");
            rSet.close();

            
            System.out.println("Found warehouse order: ");
            System.out.println("Order number: " + orderNumber);
            System.out.println("Warehouse id: " + warehouseId);
            System.out.println("element type: " + elementType);
            System.out.println("Number of items: " + numItems);
            System.out.println("cost: " + cost);
            System.out.println("eta: " + eta);
            System.out.println("description: " + description);


        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }
}
