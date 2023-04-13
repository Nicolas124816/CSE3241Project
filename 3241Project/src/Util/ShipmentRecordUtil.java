package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import cse3241.DBConnection;

public class ShipmentRecordUtil {

    public static void addRecord(Scanner scan) {
        System.out.println("Enter the package id: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the drone serial number: ");
        int serialNumber = scan.nextInt();
        scan.nextLine();

        Connection conn = DBConnection.conn;
        try {
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO Shipment values (?, ?)");
            stmt.setInt(1, id);
            stmt.setInt(2, serialNumber);
            stmt.execute();
            System.out.println("Added new shipment with package id: " + id
                    + " and serial number: " + serialNumber);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void deleteRecord(Scanner scan) {
        System.out.println("Enter the package id: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the drone serial number: ");
        int serialNumber = scan.nextInt();
        scan.nextLine();

        try {
            PreparedStatement stmt1 = DBConnection.conn.prepareStatement(
                    "DELETE FROM Shipment WHERE package_id=? AND drone_serial_number=?;");
            stmt1.setInt(1, id);
            stmt1.setInt(2, serialNumber);
            stmt1.execute();

            System.out.println("Deleted shipment with id: " + id
                    + " and serial number: " + serialNumber);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateRecord(Scanner scan) {
        System.out.println(
                "Enter the package id of the shipment to update: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println(
                "Enter the drone serial number of the shipment to update: ");
        int serialNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Specify the updated values: ");
        System.out.println("Enter the package id: ");
        int newId = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the serial number: ");
        int newSerial = scan.nextInt();
        scan.nextLine();

        try {
            PreparedStatement stmt = DBConnection.conn.prepareStatement(
                    "UPDATE Shipment SET package_id = ? , serial_number = ? WHERE package_id=? AND drone_serial_number=?");
            stmt.setInt(1, id);
            stmt.setInt(2, serialNumber);
            stmt.setInt(3, newId);
            stmt.setInt(4, newSerial);
            stmt.execute();

            System.out.println("updated shipment with package id: "
                    + newId + " and serial number: " + serialNumber);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void searchRecord(Scanner scan) {
        System.out.println("Enter the package id: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the drone serial number: ");
        int serialNumber = scan.nextInt();
        scan.nextLine();
        Connection conn = DBConnection.conn;
        try {

            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT * FROM Shipment WHERE package_id=? AND drone_serial_number=?");
            stmt.setInt(1, id);
            stmt.setInt(2, serialNumber);
            ResultSet rSet = stmt.executeQuery();
            rSet.next();
            System.out.println("Found shipment: ");
            System.out.println("Package id: " + id);
            System.out.println("Serial number: " + serialNumber);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
