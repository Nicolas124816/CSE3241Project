package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Entities.Review;
import cse3241.DBConnection;

public class ReviewRecordUtil {

    public static void addRecord(Scanner scan) {
        System.out.println("Enter email: ");
        String email = scan.nextLine();
        System.out.println("Enter the serial number: ");
        int serialNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter rating: ");
        double rating = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the comment: ");
        String comment = scan.nextLine();

        Connection conn = DBConnection.conn;
        try {
            PreparedStatement stmt = conn
                    .prepareStatement("INSERT INTO Review values (?, ?, ?, ?)");
            stmt.setString(1, email);
            stmt.setInt(2, serialNumber);
            stmt.setDouble(3, rating);
            stmt.setString(4, comment);
            stmt.execute();
            System.out.println("Added new review for email: " + email
                    + "and serial number: " + serialNumber);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void deleteRecord(Scanner scan) {
        System.out.println("Enter the email of the review to delete: ");
        String email = scan.nextLine();
        System.out
                .println("Enter the serial number for the review to delete: ");
        int serialNumber = scan.nextInt();
        scan.nextLine();

        try {
            PreparedStatement stmt1 = DBConnection.conn.prepareStatement(
                    "DELETE FROM Review WHERE email=? AND serial_number=?;");
            stmt1.setString(1, email);
            stmt1.setInt(2, serialNumber);
            stmt1.execute();

            System.out.println("Deleted review with email: " + email
                    + " and serial number: " + serialNumber);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateRecord(Scanner scan) {
        System.out.println("Enter the email of the review to delete: ");
        String oldEmail = scan.nextLine();
        System.out
                .println("Enter the serial number for the review to delete: ");
        int oldSerialNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Specify the updated values: ");
        System.out.println("Enter email: ");
        String email = scan.nextLine();
        System.out.println("Enter the serial number");
        int serialNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter rating: ");
        double rating = scan.nextDouble();
        System.out.println("Enter the comment: ");
        String comment = scan.nextLine();
        scan.nextLine();

        try {
            PreparedStatement stmt = DBConnection.conn.prepareStatement(
                    "UPDATE Review SET email = ? , serial_number = ?, rating=?, comment=? WHERE email=? AND serial_number=?");
            stmt.setString(1, email);
            stmt.setInt(2, serialNumber);
            stmt.setDouble(3, rating);
            stmt.setString(4, comment);
            stmt.setString(5, oldEmail);
            stmt.setInt(6, oldSerialNumber);
            stmt.execute();

            System.out.println(
                    "updated review with serial number: " + serialNumber);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void searchRecord(Scanner scan) {
        System.out.println("Specify the email of the review: ");
        String email = scan.nextLine();
        System.out.println("Specify the serial number of the review: ");
        int serialNumber = scan.nextInt();
        scan.nextLine();
        Connection conn = DBConnection.conn;
        Review found = null;
        try {

            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT * FROM Review WHERE email=? AND serial_number=?");
            stmt.setString(1, email);
            stmt.setInt(2, serialNumber);
            ResultSet rSet = stmt.executeQuery();
            rSet.next();
            double rating = rSet.getDouble("rating");
            String comment = rSet.getString("comment");
            System.out.println("Found review: ");
            System.out.println("Email: " + email);
            System.out.println("Serial number: " + serialNumber);
            System.out.println("Rating: " + rating);
            System.out.println("Comment: " + comment);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
