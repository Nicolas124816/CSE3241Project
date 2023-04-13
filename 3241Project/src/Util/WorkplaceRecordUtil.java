package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import cse3241.DBConnection;

public class WorkplaceRecordUtil {

    public static void addRecord(Scanner scan) {
        System.out.println("Enter the worker's email: ");
        String email = scan.nextLine();
        System.out.println("Enter the warehouse id: ");
        int warehouseId = scan.nextInt();
        scan.nextLine();

        Connection conn = DBConnection.conn;
        try {
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO Workplace values (?, ?)");
            stmt.setString(1, email);
            stmt.setInt(2, warehouseId);
            stmt.execute();
            System.out.println("Added new workplace with email: " + email + " and warehouse id: " + warehouseId);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void deleteRecord(Scanner scan) {
        System.out.println("Enter the worker's email: ");
        String email = scan.nextLine();
        System.out.println("Enter the warehouse id: ");
        int warehouseId = scan.nextInt();
        scan.nextLine();

        try {
            PreparedStatement stmt1 = DBConnection.conn.prepareStatement(
                    "DELETE FROM Workplace WHERE email=? AND warehouse_id=?;");
            stmt1.setString(1, email);
            stmt1.setInt(2, warehouseId);
            stmt1.execute();

            System.out.println("Deleted workplace with email: " + email + " and warehouse id: " + warehouseId);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateRecord(Scanner scan) {
        System.out.println("Enter the worker's email: ");
        String email = scan.nextLine();
        System.out.println("Enter the warehouse id: ");
        int warehouseId = scan.nextInt();
        scan.nextLine();

        System.out.println("Specify the updated values: ");
        System.out.println("Enter the worker's email: ");
        String newEmail = scan.nextLine();
        System.out.println("Enter the warehouse id: ");
        int newWarehouseId = scan.nextInt();
        scan.nextLine();

        try {
            PreparedStatement stmt = DBConnection.conn.prepareStatement(
                    "UPDATE Workplace SET email=?, warehouse_id=? WHERE email=? AND warehouse_id=?");
            stmt.setString(1, email);
            stmt.setInt(2, warehouseId);
            stmt.setString(3, newEmail);
            stmt.setInt(4, newWarehouseId);
            stmt.execute();

            System.out.println("updated workplace with email: " + newEmail + " and warehouse id: " + newWarehouseId);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void searchRecord(Scanner scan) {
        System.out.println("Enter the worker's email: ");
        String email = scan.nextLine();
        System.out.println("Enter the warehouse id: ");
        int warehouseId = scan.nextInt();
        scan.nextLine();

        Connection conn = DBConnection.conn;
        try {

            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT * FROM Workplace WHERE email=? AND warehouse_id=?");
            stmt.setString(1, email);
            stmt.setInt(2, warehouseId);
            ResultSet rSet = stmt.executeQuery();
            rSet.next();
            System.out.println("Found workplace: ");
            System.out.println("email: " + email);
            System.out.println("warehouse id: " + warehouseId);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
