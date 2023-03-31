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
        System.out.println("Enter volume: ");
        double volume = scan.nextDouble();
        System.out.println("Enter weight: ");
        double weight = scan.nextDouble();
        System.out.println("Enter material: ");
        String material = scan.nextLine();
        scan.nextLine();

        ShippingContainer added = new ShippingContainer();
        added.setPackageID(Packid);
        added.setVolume(volume);
        added.setWeight(weight);
        added.setMaterial(material);
        double cost = 1.5 * volume * weight;
        added.setCost(cost);

        System.out
                .println("Added new ShippingContainer: \n" + added.toString());
        Connection conn = DBConnection.conn;
        try {
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO ShippingContainer (PackageID, Volume, Weight, Material) values (?, ?, ?, ?)");
            stmt.setInt(1, Packid);
            stmt.setDouble(2, volume);
            stmt.setDouble(3, weight);
            stmt.setString(4, material);
            stmt.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void deleteRecord(Scanner scan) {
        ShippingContainer delete = searchRecord(scan);
        try {
            PreparedStatement stmt1 = DBConnection.conn.prepareStatement(
                    "DELETE FROM ShippingContainer WHERE PackageID=?;");
            stmt1.setInt(1, delete.getPackageID());
            stmt1.execute();

            System.out.println(
                    "Deleted ShippingContainer: \n" + delete.toString());
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateRecord(Scanner scan) {
        ShippingContainer update = searchRecord(scan);
        System.out.println("Enter PackageID: ");
        int PackageID = scan.nextInt();
        System.out.println("Enter volume: ");
        double volume = scan.nextDouble();
        System.out.println("Enter weight: ");
        double weight = scan.nextDouble();
        System.out.println("Enter the material: ");
        String material = scan.nextLine();
        scan.nextLine();

        try {
            PreparedStatement stmt = DBConnection.conn.prepareStatement(
                    "UPDATE Review SET volume = ? , weight = ?, material = ? WHERE PackageID = ?");
            stmt.setDouble(1, volume);
            stmt.setDouble(2, weight);
            stmt.setString(3, material);
            stmt.setInt(4, PackageID);
            stmt.execute();

            System.out.println(
                    "updated ShippingContainer: \n" + update.toString());
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static ShippingContainer searchRecord(Scanner scan) {
        System.out.println("Specify the PackageID of the ShippingContainer: ");
        String Packid = scan.nextLine();
        Connection conn = DBConnection.conn;
        ShippingContainer found = null;
        try {
            System.out.println(conn.getMetaData());

            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT volume,weight,material FROM ShippingContainer WHERE PackageID=?");
            stmt.setString(1, Packid);
            ResultSet rSet = stmt.executeQuery();
            rSet.next();
            double volume = rSet.getDouble("volume");
            double weight = rSet.getDouble("weight");
            String material = rSet.getString("material");
            ShippingContainer newSC = new ShippingContainer();
            newSC.setVolume(volume);
            newSC.setWeight(weight);
            newSC.setMaterial(material);
            double cost = 1.5 * volume * weight;
            newSC.setCost(cost);

            return newSC;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return found;
    }
}
