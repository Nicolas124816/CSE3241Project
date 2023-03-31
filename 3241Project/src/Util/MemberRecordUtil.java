package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Entities.Member;
import Input.DateHelper;
import cse3241.DBConnection;

public class MemberRecordUtil {

    public static void addRecord(Scanner scan) {
        System.out.println("Enter first name: ");
        String firstName = scan.nextLine();
        System.out.println("Enter last name: ");
        String lastName = scan.nextLine();
        System.out.println("Enter address: ");
        String address = scan.nextLine();
        System.out.println("Enter phone number (no dashes or spaces): ");
        String phone = scan.nextLine();
        System.out.println("Enter email address: ");
        String email = scan.nextLine();
        System.out.println("Enter the join date (yyyy-MM-dd) for the member: ");
        String startDate = scan.nextLine();
        System.out.println("Enter the member ID: ");
        int id = scan.nextInt();
        scan.nextLine();
        Member added = new Member(firstName, lastName, address, phone, email,
                startDate, null, id);
        System.out.println("Added new member: \n" + added.toString());
        Connection conn = DBConnection.conn;
        try {
            PreparedStatement stmt1 = conn.prepareStatement(
                    "INSERT INTO Person (Email, First_Name, Last_Name, Address, Phone) values (?, ?, ?, ?, ?);");
            stmt1.setString(1, email);
            stmt1.setString(2, firstName);
            stmt1.setString(3, lastName);
            stmt1.setString(4, address);
            stmt1.setString(5, phone);

            PreparedStatement stmt2 = conn.prepareStatement(
                    "INSERT INTO Member (Email, start_date, user_ID) values (?, ?, ?);");
            stmt2.setString(1, email);
            stmt2.setDate(2, DateHelper.getDate(startDate));
            stmt2.setInt(3, id);
            stmt2.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void deleteRecord(Scanner scan) {
        Member delete = searchRecord(scan);
        try {
            PreparedStatement stmt1 = DBConnection.conn
                    .prepareStatement("DELETE FROM Person WHERE Email=?;");
            stmt1.setString(1, delete.getEmail());
            stmt1.execute();

            System.out.println("Deleted member: \n" + delete.toString());
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateRecord(Scanner scan) {
        Member update = searchRecord(scan);
        //modify member object and store in database
    }

    public static Member searchRecord(Scanner scan) {
        System.out.println("Specify the email of the member: ");
        String email = scan.nextLine();
        Connection conn = DBConnection.conn;
        Member found = null;
        try {
            PreparedStatement stmt1 = conn.prepareStatement(
                    "SELECT Email, First_Name, Last_Name, Address, Phone FROM Person"
                            + "WHERE Email = ?");
            stmt1.setString(1, email);
            ResultSet rSet = stmt1.executeQuery();
            rSet.next(); //only one entry will be returned, searching by key
            String firstName = rSet.getString("First_Name");
            String lastName = rSet.getString("Last_Name");
            String address = rSet.getString("Address");
            String phone = rSet.getString("Phone");

            PreparedStatement stmt2 = conn.prepareStatement(
                    "SELECT Email, start_date, user_ID FROM Person"
                            + "WHERE Email = ?");
            stmt2.setString(1, email);
            rSet = stmt2.executeQuery();
            rSet.next();
            java.sql.Date startDate = rSet.getDate("start_date");
            int userID = rSet.getInt("user_ID");
            found = new Member(firstName, lastName, address, phone, email,
                    startDate.toString(), null, userID);

        } catch (SQLException e) {
            System.out.println(e);
        }
        return found;
    }
}
