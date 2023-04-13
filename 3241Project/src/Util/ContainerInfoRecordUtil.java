package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import cse3241.DBConnection;

public class ContainerInfoRecordUtil {

    public static void addRecord(Scanner scan) {
        System.out.println("Enter the package id: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the equipment serial number: ");
        int serialNumber = scan.nextInt();
        scan.nextLine();

        Connection conn = DBConnection.conn;
        try {
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO Container_Info values (?, ?)");
            stmt.setInt(1, id);
            stmt.setInt(2, serialNumber);
            stmt.execute();
            System.out.println("Added new container info with package id: " + id
                    + " and serial number: " + serialNumber);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void deleteRecord(Scanner scan) {
        System.out.println("Enter the package id: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the equipment serial number: ");
        int serialNumber = scan.nextInt();
        scan.nextLine();

        try {
            PreparedStatement stmt1 = DBConnection.conn.prepareStatement(
                    "DELETE FROM Container_Info WHERE package_id=? AND equipment_serial_number=?;");
            stmt1.setInt(1, id);
            stmt1.setInt(2, serialNumber);
            stmt1.execute();

            System.out.println("Deleted container info with id: " + id
                    + " and serial number: " + serialNumber);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateRecord(Scanner scan) {
        System.out.println(
                "Enter the package id of the container info to update: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println(
                "Enter the equipment serial number of the container info to update: ");
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
                    "UPDATE Container_Info SET package_id = ? , serial_number = ? WHERE package_id=? AND equipment_serial_number=?");
            stmt.setInt(1, id);
            stmt.setInt(2, serialNumber);
            stmt.setInt(3, newId);
            stmt.setInt(4, newSerial);
            stmt.execute();

            System.out.println("updated container info with package id: "
                    + newId + " and serial number: " + serialNumber);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void searchRecord(Scanner scan) {
        System.out.println("Enter the package id: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the equipment serial number: ");
        int serialNumber = scan.nextInt();
        scan.nextLine();
        Connection conn = DBConnection.conn;
        try {

            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT * FROM Container_Info WHERE package_id=? AND equipment_serial_number=?");
            stmt.setInt(1, id);
            stmt.setInt(2, serialNumber);
            ResultSet rSet = stmt.executeQuery();
            rSet.next();
            System.out.println("Found container info: ");
            System.out.println("Package id: " + id);
            System.out.println("Serial number: " + serialNumber);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
