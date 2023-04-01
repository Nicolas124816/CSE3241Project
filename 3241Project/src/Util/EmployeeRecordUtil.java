package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Entities.Employee;
import Input.DateHelper;
import cse3241.DBConnection;

public class EmployeeRecordUtil {

    public static void addRecord(Scanner scan) {
        System.out.println("Enter Email: ");
        String email = scan.nextLine();
        System.out.println("Enter salary: ");
        int salary = scan.nextInt();
        System.out.println("Enter the position: ");
        String position = scan.nextLine();
        System.out
                .println("Enter the start date (yyyy-MM-dd) of the employee: ");
        String std = scan.nextLine();
        java.sql.Date startDate = DateHelper.getDate(std);
        scan.nextLine();

        Employee added = new Employee();
        added.setSalary(salary);
        added.setPosition(position);
        added.setStartDate(startDate.toString());

        System.out.println("Added new employee: \n" + added.toString());
        Connection conn = DBConnection.conn;
        try {
            /*
             * PreparedStatement stmt1 = conn.prepareStatement(
             * "INSERT INTO Person (Email, First_Name, Last_Name, Address, Phone) values (?, ?, ?, ?, ?)"
             * ); stmt1.setString(1, email); stmt1.setString(2, firstName);
             * stmt1.setString(3, lastName); stmt1.setString(4, address);
             * stmt1.setString(5, phone); stmt1.execute(); just in case, if
             * later person is the superclass of employee
             */

            PreparedStatement stmt2 = conn.prepareStatement(
                    "INSERT INTO Employee (salary, start_date, Position) values (?, ?, ?)");
            stmt2.setInt(1, salary);
            stmt2.setDate(2, DateHelper.getDate(std));
            stmt2.setString(3, position);
            stmt2.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void deleteRecord(Scanner scan) {
        Employee delete = searchRecord(scan);
        try {
            PreparedStatement stmt1 = DBConnection.conn
                    .prepareStatement("DELETE FROM Employee WHERE Email=?;");
            //stmt1.setString(1, delete.getEmail());
            stmt1.execute();

            System.out.println("Deleted member: \n" + delete.toString());
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateRecord(Scanner scan) {
        Employee update = searchRecord(scan);
        System.out.println("Enter new Email: ");
        String email = scan.nextLine();
        System.out.println("Enter new salary: ");
        int salary = scan.nextInt();
        System.out.println("Enter the new position: ");
        String position = scan.nextLine();
        System.out.println(
                "Enter the new start date (yyyy-MM-dd) of the employee: ");
        String std = scan.nextLine();
        scan.nextLine();

        try {
            PreparedStatement stmt1 = DBConnection.conn.prepareStatement(
                    "UPDATE Employee SET salary = ? , start_date = ? , Position = ? WHERE Email = ?");
            stmt1.setInt(1, salary);
            stmt1.setDate(2, DateHelper.getDate(std));
            stmt1.setString(3, position);
            stmt1.setString(4, email);
            stmt1.execute();

            System.out.println("updated member: \n" + update.toString());
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static Employee searchRecord(Scanner scan) {
        System.out.println("Specify the email of the employee: ");
        String email = scan.nextLine();
        Connection conn = DBConnection.conn;
        Employee found = null;
        try {
            /*
             * PreparedStatement stmt1 = conn.prepareStatement(
             * "SELECT First_Name, Last_Name, Address, Phone FROM Person\n WHERE Email=?"
             * ); stmt1.setString(1, email); ResultSet rSet =
             * stmt1.executeQuery(); rSet.next(); //only one entry will be
             * returned, searching by key String firstName =
             * rSet.getString("First_Name"); String lastName =
             * rSet.getString("Last_Name"); String address =
             * rSet.getString("Address"); String phone =
             * rSet.getString("Phone"); just in case, if later person is the
             * superclass of employee
             */

            PreparedStatement stmt2 = conn.prepareStatement(
                    "SELECT salary, start_date, Position FROM Employee WHERE Email=?");
            stmt2.setString(1, email);
            ResultSet rSet = stmt2.executeQuery();
            rSet.next();
            String startDate = rSet.getString("start_date");
            int salary = rSet.getInt("salary");
            String position = rSet.getString("Position");
            Employee newEm = new Employee();
            newEm.setSalary(salary);
            newEm.setPosition(position);
            newEm.setStartDate(startDate);
            return newEm;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return found;
    }
}
