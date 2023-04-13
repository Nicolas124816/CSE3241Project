package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Entities.ShippingContainer;
import cse3241.DBConnection;

public class ShippingContainerRecordUtil {

    public static void addRecord(Scanner scan) {
        System.out.println("Enter PackageID: ");
        int Packid = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter volume: ");
        int volume = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter weight: ");
        int weight = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter material: ");
        String material = scan.nextLine();

        ShippingContainer added = new ShippingContainer();
        added.setPackageID(Packid);
        added.setVolume(volume);
        added.setWeight(weight);
        added.setMaterial(material);
        double cost = 1.5 * volume * weight;
        added.setCost(cost);

        Connection conn = DBConnection.conn;
        try {
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO Shipping_Container (package_id, Volume, Weight, Material) values (?, ?, ?, ?)");
            stmt.setInt(1, Packid);
            stmt.setInt(2, volume);
            stmt.setInt(3, weight);
            stmt.setString(4, material);
            stmt.execute();

            System.out
                .println("Added new ShippingContainer with id: " + Packid);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void deleteRecord(Scanner scan) {
        System.out.println("Enter id of shipping container to delete: ");
        int id = scan.nextInt();
        scan.nextLine();
        try {
            PreparedStatement stmt1 = DBConnection.conn.prepareStatement(
                    "DELETE FROM Shipping_Container WHERE package_id=?;");
            stmt1.setInt(1, id);
            stmt1.execute();

            System.out.println(
                    "Deleted ShippingContainer with id: " + id);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateRecord(Scanner scan) {
        System.out.println("Enter the id of the shipping container to delete: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Specify new values for the record: ");
        System.out.println("Enter PackageID: ");
        int PackageID = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter volume: ");
        int volume = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter weight: ");
        int weight = scan.nextInt();
        System.out.println("Enter the material: ");
        String material = scan.nextLine();
        scan.nextLine();

        try {
            PreparedStatement stmt = DBConnection.conn.prepareStatement(
                    "UPDATE Shipping_Container SET volume = ? , weight = ?, material = ? WHERE package_id = ?");
            stmt.setInt(1, volume);
            stmt.setInt(2, weight);
            stmt.setString(3, material);
            stmt.setInt(4, PackageID);
            stmt.execute();

            System.out.println(
                    "updated Shipping Container with package id: " + id);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void searchRecord(Scanner scan) {
        System.out.println("Specify the PackageID of the ShippingContainer: ");
        String Packid = scan.nextLine();
        Connection conn = DBConnection.conn;
        ShippingContainer found = null;
        try {
            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT * FROM Shipping_Container WHERE package_id=?");
            stmt.setString(1, Packid);
            ResultSet rSet = stmt.executeQuery();
            rSet.next();
            int volume = rSet.getInt("volume");
            int weight = rSet.getInt("weight");
            String material = rSet.getString("material");
            double cost = 1.5 * volume * weight;

            System.out.println("Found shipping container: ");
            System.out.println("PackageID: " + Packid);
            System.out.println("Volume: " + volume);
            System.out.println("Weight: " + weight);
            System.out.println("Material: " + material);


        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
