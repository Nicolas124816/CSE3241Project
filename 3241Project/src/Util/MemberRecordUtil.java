package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
        int phone = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter email address: ");
        String email = scan.nextLine();
        System.out.println("Enter the join date (MM/dd/yy) for the member: ");
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

            PreparedStatement stmt2 = conn.prepareStatement(
                    "INSERT INTO Member (Email, start_date, user_ID) values (?, ?, ?);");
            stmt2.setString(1, email);
            stmt2.setDate(2, DateHelper.getDate(startDate));
            stmt2.setInt(3, id);
            stmt2.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }

        //add to database here
    }

    public static void deleteRecord(Scanner scan) {
        Member delete = searchRecord(scan);
        System.out.println("Deleted member: \n" + delete.toString());
        //remove from database here
    }

    public static void updateRecord(Scanner scan) {
        Member update = searchRecord(scan);
        //modify member object and store in database
    }

    public static Member searchRecord(Scanner scan) {
        System.out.println("Specify the ID of the member: ");
        String userID = scan.nextLine();
        //get member from database here
        return null;
    }
}
