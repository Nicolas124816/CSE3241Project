package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Input.DateHelper;
import cse3241.DBConnection;

public class EmployeeRecordUtil {

    public static void addRecord(Scanner scan) {
        System.out.println("Enter Email: ");
        String email = scan.nextLine();
        System.out.println("Enter the first name: ");
        String firstName = scan.nextLine();
        System.out.println("Enter the last name: ");
        String lastName = scan.nextLine();
        System.out.println("Enter the address: ");
        String address = scan.nextLine();
        System.out.println("Enter the phone number (no dashes or spaces):");
        String phone = scan.nextLine();
        System.out.println("Enter salary (int): ");
        int salary = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the position: ");
        String position = scan.nextLine();
        System.out
                .println("Enter the start date (yyyy-MM-dd) of the employee: ");
        String std = scan.nextLine();

        Connection conn = DBConnection.conn;
        try {

            PreparedStatement stmt1 = conn.prepareStatement(
                    "INSERT INTO Person values (?, ?, ?, ?, ?)");
            stmt1.setString(1, email);
            stmt1.setString(2, firstName);
            stmt1.setString(3, lastName);
            stmt1.setString(4, address);
            stmt1.setString(5, phone);
            stmt1.execute();

            PreparedStatement stmt2 = conn.prepareStatement(
                    "INSERT INTO Employee (email, salary, start_date, position) values (?, ?, ?, ?)");
            stmt2.setString(1, email);
            stmt2.setInt(2, salary);
            stmt2.setDate(3, DateHelper.getDate(std));
            stmt2.setString(4, position);
            stmt2.execute();
            System.out.println("Added new employee with email: " + email);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void deleteRecord(Scanner scan) {
        System.out.println("Enter the email of the employee to delete: ");
        String email = scan.nextLine();
        try {
            PreparedStatement stmt1 = DBConnection.conn
                    .prepareStatement("DELETE FROM Employee WHERE Email=?;");
            stmt1.setString(1, email);
            stmt1.execute();

            PreparedStatement stmt2 = DBConnection.conn
                    .prepareStatement("DELETE FROM Person WHERE Email=?;");
            stmt2.setString(1, email);
            stmt2.execute();

            System.out.println("Deleted member with email: " + email);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateRecord(Scanner scan) {
        System.out.println("Enter the email of the employee to update: ");
        String oldEmail = scan.nextLine();
        System.out.println("Specify new values for the record: ");
        System.out.println("Enter Email: ");
        String email = scan.nextLine();
        System.out.println("Enter the first name: ");
        String firstName = scan.nextLine();
        System.out.println("Enter the last name: ");
        String lastName = scan.nextLine();
        System.out.println("Enter the address: ");
        String address = scan.nextLine();
        System.out.println("Enter the phone number (no dashes or spaces):");
        String phone = scan.nextLine();
        System.out.println("Enter salary (int): ");
        int salary = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the position: ");
        String position = scan.nextLine();
        System.out
                .println("Enter the start date (yyyy-MM-dd) of the employee: ");
        String std = scan.nextLine();

        try {
            PreparedStatement stmt1 = DBConnection.conn.prepareStatement(
                    "UPDATE Employee SET email=?, salary = ? , start_date = ? , position = ? WHERE email = ?");
            stmt1.setString(1, oldEmail);
            stmt1.setInt(2, salary);
            stmt1.setDate(3, DateHelper.getDate(std));
            stmt1.setString(4, position);
            stmt1.setString(5, email);
            stmt1.execute();

            PreparedStatement stmt2 = DBConnection.conn.prepareStatement(
                    "UPDATE Person SET email=?, first_name=? , last_name = ? , address = ?, phone=? WHERE email = ?");
            stmt2.setString(1, email);
            stmt2.setString(2, firstName);
            stmt2.setString(3, lastName);
            stmt2.setString(4, address);
            stmt2.setString(5, phone);
            stmt2.setString(6, oldEmail);

            System.out.println("updated member with email: " + email);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void searchRecord(Scanner scan) {
        System.out.println("Specify the email of the employee: ");
        String email = scan.nextLine();
        Connection conn = DBConnection.conn;
        try {

            PreparedStatement stmt1 = conn
                    .prepareStatement("SELECT * FROM Person WHERE Email=?");
            stmt1.setString(1, email);
            ResultSet rSet = stmt1.executeQuery();
            rSet.next();
            String firstName = rSet.getString("first_name");
            String lastName = rSet.getString("last_name");
            String address = rSet.getString("address");
            int phone = rSet.getInt("phone");
            rSet.close();

            PreparedStatement stmt2 = conn
                    .prepareStatement("SELECT * FROM Employee WHERE Email=?");
            stmt2.setString(1, email);
            rSet = stmt2.executeQuery();
            rSet.next();
            String startDate = rSet.getString("start_date");
            int salary = rSet.getInt("salary");
            String position = rSet.getString("Position");
            System.out.println("Found employee: ");
            System.out.println("Email: " + email);
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("Address: " + address);
            System.out.println("Phone number: " + phone);
            System.out.println("Salary: " + salary);
            System.out.println("Start Date: " + startDate);
            System.out.println("Position: " + position);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
