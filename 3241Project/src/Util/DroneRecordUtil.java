package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import cse3241.DBConnection;

public class DroneRecordUtil {

    public static void addRecord(Scanner scan) {
        System.out.println("Enter drone serial number: ");
        int serial_num = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the weight capacity (int): ");
        int weightCapacity = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the volume capacity (int): ");
        int volumeCapacity = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the autonomous distance (int): ");
        int distanceAutonomy = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the drone max speed (int): ");
        int speed = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the drone status: ");
        String status = scan.nextLine();
        System.out.println("Enter the drone's fleet id (int): ");
        int fleetId = scan.nextInt();
        scan.nextLine();

        Connection conn = DBConnection.conn;
        try {
            PreparedStatement stmt1 = conn.prepareStatement(
                    "INSERT INTO Drone values (?, ?, ?, ?, ?, ?, ?)");
            stmt1.setInt(1, serial_num);
            stmt1.setInt(2, weightCapacity);
            stmt1.setInt(3, volumeCapacity);
            stmt1.setInt(4, distanceAutonomy);
            stmt1.setInt(5, speed);
            stmt1.setString(6, status);
            stmt1.setInt(7, fleetId);
            stmt1.execute();
            System.out.println(
                    "Added new drone with serial number: " + serial_num);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void deleteRecord(Scanner scan) {
        System.out
                .println("Specify the serial number of the drone to delete: ");
        int serial_num = scan.nextInt();
        scan.nextLine();

        try {

            PreparedStatement stmt1 = DBConnection.conn.prepareStatement(
                    "DELETE FROM Drone WHERE serial_number=?;");
            stmt1.setInt(1, serial_num);
            stmt1.execute();

            System.out.println("Deleted drone with id: " + serial_num);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateRecord(Scanner scan) {
        System.out
                .println("Specify the serial number of the drone to update: ");
        int serial_number = scan.nextInt();
        scan.nextLine();
        System.out.println("Specify new values for the record: ");
        System.out.println("Enter drone serial number: ");
        int serial_num = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the weight capacity (int): ");
        int weightCapacity = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the volume capacity (int): ");
        int volumeCapacity = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the autonomous distance (int): ");
        int distanceAutonomy = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the drone max speed (int): ");
        int speed = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the drone status: ");
        String status = scan.nextLine();
        System.out.println("Enter the drone's fleet id (int): ");
        int fleetId = scan.nextInt();
        scan.nextLine();

        try {

            PreparedStatement stmt1 = DBConnection.conn
                    .prepareStatement("UPDATE Drone"
                            + "SET serial_number=? weight_capacity=?, volume_capacity=?, distance_autonomy=?, max_speed=?, status=?, fleet_id=?"
                            + "WHERE warehouse_id=?;");
            stmt1.setInt(1, serial_number);
            stmt1.setInt(2, weightCapacity);
            stmt1.setInt(3, volumeCapacity);
            stmt1.setInt(4, distanceAutonomy);
            stmt1.setInt(5, speed);
            stmt1.setString(6, status);
            stmt1.setInt(7, fleetId);
            stmt1.execute();

            System.out.println(
                    "Deleted drone with serial number: " + serial_number);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void searchRecord(Scanner scan) {
        System.out
                .println("Specify the serial number of the drone to search: ");
        int serial_number = scan.nextInt();
        scan.nextLine();

        try {

            PreparedStatement stmt1 = DBConnection.conn.prepareStatement(
                    "SELECT * FROM Drone\n WHERE serial_number=?");
            stmt1.setInt(1, serial_number);
            ResultSet rSet = stmt1.executeQuery();
            rSet.next(); //only one entry will be returned, searching by key
            int weightCapacity = rSet.getInt("weight_capacity");
            int volumeCapacity = rSet.getInt("volume_capacity");
            int distanceAutonomy = rSet.getInt("distance_autonomy");
            int speed = rSet.getInt("max_speed");
            String status = rSet.getString("status");
            int fleetId = rSet.getInt("fleet_id");
            rSet.close();
            stmt1.close();
            System.out.println("Found drone: ");
            System.out.println("Serial number: " + serial_number);
            System.out.println("weight capacity: " + weightCapacity);
            System.out.println("volume capacity: " + volumeCapacity);
            System.out.println("distance autonomy: " + distanceAutonomy);
            System.out.println("max speed: " + speed);
            System.out.println("status: " + status);
            System.out.println("fleet id: " + fleetId);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
