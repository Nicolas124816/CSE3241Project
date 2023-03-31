package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Entities.Drone;
import Entities.Superclasses.Item;
import Input.DateHelper;
import cse3241.DBConnection;

public class DroneRecordUtil {

    public static void addRecord(Scanner scan) {
        System.out.println("Enter inventoryID: ");
        int inventoryID = scan.nextInt();
        System.out.println("Enter the expDate(yyyy-MM-dd): ");
        String expDate = scan.nextLine();
        System.out.println("Enter description: ");
        String description = scan.nextLine();
        System.out.println("Enter manufacturer: ");
        String manufacturer = scan.nextLine();
        System.out.println("Enter modelNumber: ");
        int modelNumber = scan.nextInt();
        System.out.println("Enter year: ");
        int year = scan.nextInt();
        System.out.println("Enter the serialNumber: ");
        int serialNumber = scan.nextInt();
        System.out.println("Enter fleetID: ");
        int fleetID = scan.nextInt();
        System.out.println("Enter the weightCapacity: ");
        double weightCapacity = scan.nextDouble();
        System.out.println("Enter the volumeCapacity: ");
        double volumeCapacity = scan.nextDouble();
        System.out.println("Enter distanceAutonomy: ");
        double distanceAutonomy = scan.nextDouble();
        System.out.println("Enter maxSpeed: ");
        double maxSpeed = scan.nextDouble();
        System.out.println("Enter status: ");
        String status = scan.nextLine();
        scan.nextLine();
        Item DroneItem = new Item(inventoryID, expDate, description,
                manufacturer, modelNumber, year, serialNumber);
        Drone added = new Drone(DroneItem);
        System.out.println("Added new drone: \n" + added.toString());
        Connection conn = DBConnection.conn;
        try {
            PreparedStatement stmt1 = conn.prepareStatement(
                    "INSERT INTO Item (inventoryID, Exp_Date,description, manufacturer, Model_Number, year, Serial_Number) values (?, ?, ?, ?, ?, ?, ?)");
            stmt1.setInt(1, inventoryID);
            stmt1.setDate(2, DateHelper.getDate(expDate));
            stmt1.setString(3, description);
            stmt1.setString(4, manufacturer);
            stmt1.setInt(5, modelNumber);
            stmt1.setInt(6, year);
            stmt1.setInt(7, serialNumber);
            stmt1.execute();

            PreparedStatement stmt2 = conn.prepareStatement(
                    "INSERT INTO Drone (fleetID, Weight_Capacity, Volume_Capacity, Distance_Autonomy, max_Speed, status) values (?, ?, ?, ?, ?, ?)");
            stmt2.setInt(1, fleetID);
            stmt2.setDouble(2, weightCapacity);
            stmt2.setDouble(3, volumeCapacity);
            stmt2.setDouble(4, distanceAutonomy);
            stmt2.setDouble(5, maxSpeed);
            stmt1.setString(6, status);
            stmt2.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void deleteRecord(Scanner scan) {
        Drone delete = searchRecord(scan);
        try {
            PreparedStatement stmt1 = DBConnection.conn
                    .prepareStatement("DELETE FROM Item WHERE serialNumber=?;");
            stmt1.setInt(1, delete.getSerialNumber());
            stmt1.execute();

            System.out.println("Deleted drone: \n" + delete.toString());
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateRecord(Scanner scan) {
        Drone update = searchRecord(scan);
        //modify drone object and store in database
    }

    public static Drone searchRecord(Scanner scan) {
        System.out.println("Specify the serialNumber of the drone: ");
        int serialNumber = scan.nextInt();
        Connection conn = DBConnection.conn;
        Drone found = null;
        try {
            System.out.println(conn.getMetaData());
            PreparedStatement stmt1 = conn.prepareStatement(
                    "SELECT inventoryID, Exp_Date,description, manufacturer, Model_Number, year\n WHERE Serial_Number=?");
            stmt1.setInt(1, serialNumber);
            ResultSet rSet = stmt1.executeQuery();
            rSet.next(); //only one entry will be returned, searching by key
            int inventoryID = rSet.getInt("inventoryID");
            String expDate = rSet.getString("Exp_Date");
            String description = rSet.getString("description");
            String manufacturer = rSet.getString("manufacturer");
            int modelNumber = rSet.getInt("Model_Number");
            int year = rSet.getInt("year");

            /*
             * PreparedStatement stmt2 = conn.prepareStatement(
             * "SELECT status, Weight_Capacity, Volume_Capacity FROM Drone WHERE Serial_Number=?"
             * ); stmt2.setInt(1, serialNumber); rSet = stmt2.executeQuery();
             * rSet.next(); String status = rSet.getString("status"); double
             * weightCapacity = rSet.getDouble("Weight_Capacity"); double
             * volumeCapacity = rSet.getDouble("Volume_Capacity");
             */

            Item n = new Item(inventoryID, expDate, description, manufacturer,
                    modelNumber, year, serialNumber);
            return new Drone(n);

        } catch (SQLException e) {
            System.out.println(e);
        }
        return found;
    }
}
