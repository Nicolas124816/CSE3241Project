package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import cse3241.DBConnection;

public class WarehouseRecordUtil {

    public static void addRecord(Scanner scan) {
        System.out.println("Enter warehouse id: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the city: ");
        String city = scan.nextLine();
        System.out.println("Enter address: ");
        String address = scan.nextLine();
        System.out.println("Enter phone number (no dashes or spaces): ");
        String phone = scan.nextLine();
        System.out.println("Enter manager name: ");
        String manager = scan.nextLine();

        Connection conn = DBConnection.conn;
        try {
            PreparedStatement stmt1 = conn.prepareStatement(
                    "INSERT INTO Warehouse values (?, ?, ?, ?, ?)");
            stmt1.setInt(1, id);
            stmt1.setString(2, city);
            stmt1.setString(3, address);
            stmt1.setString(4, phone);
            stmt1.setString(5, manager);
            stmt1.execute();
            System.out.println("Added new warehouse with id: " + id);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void deleteRecord(Scanner scan) {
        System.out.println("Specify the id of the warehouse to delete: ");
        int id = scan.nextInt();
        scan.nextLine();
        try {

            PreparedStatement stmt1 = DBConnection.conn.prepareStatement(
                    "DELETE FROM Warehouse WHERE warehouse_id=?;");
            stmt1.setInt(1, id);
            stmt1.execute();

            System.out.println("Deleted warehouse with id: " + id);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateRecord(Scanner scan) {
        System.out.println("Specify the id of the warehouse to update: ");
        int oldID = scan.nextInt();
        scan.nextLine();
        System.out.println("Specify new values for the record: ");
        System.out.println("Enter warehouse id: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the city: ");
        String city = scan.nextLine();
        System.out.println("Enter address: ");
        String address = scan.nextLine();
        System.out.println("Enter phone number (no dashes or spaces): ");
        String phone = scan.nextLine();
        System.out.println("Enter manager name: ");
        String manager = scan.nextLine();

        try {

            PreparedStatement stmt1 = DBConnection.conn
                    .prepareStatement("UPDATE Warehouse"
                            + "SET warehouse_id=? city=?, address=?, phone=?, manager_name=?"
                            + "WHERE warehouse_id=?;");
            stmt1.setInt(1, id);
            stmt1.setString(2, city);
            stmt1.setString(3, address);
            stmt1.setString(4, phone);
            stmt1.setString(5, manager);
            stmt1.execute();
            stmt1.execute();

            System.out.println("Deleted warehouse with id: " + id);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void searchRecord(Scanner scan) {
        System.out.println("Specify the id of the warehouse to search: ");
        int id = scan.nextInt();
        scan.nextLine();

        try {

            PreparedStatement stmt1 = DBConnection.conn.prepareStatement(
                    "SELECT * FROM Warehouse\n WHERE warehouse_id=?");
            stmt1.setInt(1, id);
            ResultSet rSet = stmt1.executeQuery();
            rSet.next(); //only one entry will be returned, searching by key
            String city = rSet.getString("city");
            String address = rSet.getString("address");
            String phone = rSet.getString("phone");
            String manager = rSet.getString("manager_name");
            rSet.close();
            stmt1.close();
            System.out.println("Found warehouse: ");
            System.out.println("Warehouse id: " + id);
            System.out.println("City: " + city);
            System.out.println("Address: " + address);
            System.out.println("Phone: " + phone);
            System.out.println("Manager name: " + manager);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
