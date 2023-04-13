package Util;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Input.DateHelper;
import cse3241.DBConnection;

public class RentsRecordUtil {

    public static void addRecord(Scanner scan) {
        System.out.println("Enter the member's email: ");
        String email = scan.nextLine();
        System.out.println("Enter the serial number: ");
        int serialNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the checkout date: ");
        String checkoutDate = scan.nextLine();
        System.out.println("Enter the return date: ");
        String returnDate = scan.nextLine();

        Connection conn = DBConnection.conn;
        try {
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO Rents values (?, ?, ?, ?)");
            stmt.setString(1, email);
            stmt.setInt(2, serialNumber);
            stmt.setDate(3, DateHelper.getDate(checkoutDate));
            stmt.setDate(4, DateHelper.getDate(returnDate));
            stmt.execute();
            System.out.println("Added new rent with email: " + email + " and serial number: " + serialNumber);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void deleteRecord(Scanner scan) {
        System.out.println("Enter the member's email: ");
        String email = scan.nextLine();
        System.out.println("Enter the serial number: ");
        int serialNumber = scan.nextInt();

        try {
            PreparedStatement stmt1 = DBConnection.conn.prepareStatement(
                    "DELETE FROM Rents WHERE email=? AND serial_number=?;");
            stmt1.setString(1, email);
            stmt1.setInt(2, serialNumber);
            stmt1.execute();

            System.out.println("Deleted rent with email: " + email + " and serial number: " + serialNumber);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateRecord(Scanner scan) {
        System.out.println("Enter the member's email: ");
        String email = scan.nextLine();
        System.out.println("Enter the serial number: ");
        int serialNumber = scan.nextInt();

        System.out.println("Specify the updated values: ");
        System.out.println("Enter the member's email: ");
        String newEmail = scan.nextLine();
        System.out.println("Enter the serial number: ");
        int newSerialNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the checkout date: ");
        String checkoutDate = scan.nextLine();
        System.out.println("Enter the return date: ");
        String returnDate = scan.nextLine();

        try {
            PreparedStatement stmt = DBConnection.conn.prepareStatement(
                    "UPDATE Rents SET email=?, serial_number=?, checkout_date=?, return_date=? WHERE email=? AND serial_number=?");
            stmt.setString(1, newEmail);
            stmt.setInt(2, newSerialNumber);
            stmt.setDate(3, DateHelper.getDate(checkoutDate));
            stmt.setDate(4, DateHelper.getDate(returnDate));
            stmt.setString(5, email);
            stmt.setInt(6, serialNumber);
            stmt.execute();

            System.out.println("updated rent with member email: " + newEmail + " and serial number: " + newSerialNumber);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void searchRecord(Scanner scan) {
        System.out.println("Enter the member's email: ");
        String email = scan.nextLine();
        System.out.println("Enter the serial number: ");
        int serialNumber = scan.nextInt();

        Connection conn = DBConnection.conn;
        try {

            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT * FROM Rents WHERE email=? AND serial_number=?");
            stmt.setString(1, email);
            stmt.setInt(2, serialNumber);
            ResultSet rSet = stmt.executeQuery();
            rSet.next();
            String checkoutDate = rSet.getString("checkout_date");
            String returnDate = rSet.getString("return_date");
            System.out.println("Found rent: ");
            System.out.println("email: " + email);
            System.out.println("serial number: " + serialNumber);
            System.out.println("checkout date: " + checkoutDate);
            System.out.println("return date: " + returnDate);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
