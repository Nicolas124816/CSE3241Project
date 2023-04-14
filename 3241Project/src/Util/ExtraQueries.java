package Util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Input.InputHelper;
import cse3241.DBConnection;

public class ExtraQueries {

    public static void runExtraQueries(Scanner scan) {
        int option = InputHelper.getQueryOptions(scan);
        switch (option) {
            case 1:
                extraQuery1(scan);
                break;
            case 2:
                extraQuery2(scan);
                break;
            case 3:
                extraQuery3(scan);
                break;
            case 4:
                extraQuery4(scan);
                break;
            default:
                System.out.println("You didn't enter a valid option");
        }
    }

    private static void extraQuery1(Scanner scan) {
        System.out.println(
                "Query to find list of equipment by manufacturer made before a certain year: ");
        System.out.println("Manufacturer of equipment: ");
        String manufacturer = scan.nextLine();
        System.out.println("Year to find equipment released before: ");
        int year = scan.nextInt();
        scan.nextLine();
        String sql = "SELECT description\n"
                + "FROM Equipment, Item_Model, Item\n"
                + "WHERE Item.Model_Number = Item_Model.Model_Number \n"
                + "AND Item.Serial_Number = Item.Serial_Number\n"
                + "AND Item_Model.Manufacturer = ?\n"
                + "AND Item_Model.Year < ?;";
        try {
            PreparedStatement stmt = DBConnection.conn.prepareStatement(sql);
            stmt.setString(1, manufacturer);
            stmt.setInt(2, year);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(
                        "Item description: " + rs.getString("description"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    private static void extraQuery2(Scanner scan) {
        System.out.println(
                "Query to find the watering equipment checked out by a member: ");
        System.out
                .println("Enter member ID for their watering equipment info: ");
        int id = scan.nextInt();
        scan.nextLine();
        String sql = "SELECT Equipment.Serial_Number, Checkout_date\n"
                + "FROM Equipment, Rents, Member\n"
                + "WHERE Equipment.Serial_Number = Rents.Serial_Number\n"
                + "AND Equipment.Type = 'Watering'\n"
                + "AND Member.user_ID = ?;";
        try {
            PreparedStatement stmt = DBConnection.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Info: " + rs.getInt("Serial_Number")
                        + rs.getDate("Checkout_date"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    private static void extraQuery3(Scanner scan) {
        System.out.println(
                "Query to find employees who are also members of our service: ");

        String sql = "SELECT    COUNT(MEMBER.email) AS Both_member_employee\n"
                + "        FROM    MEMBER, EMPLOYEE\n"
                + "        WHERE         EMPLOYEE.email = MEMBER.email ;";
        try {
            PreparedStatement stmt = DBConnection.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Number of employees who are also members: "
                        + rs.getInt("Both_member_employee"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    private static void extraQuery4(Scanner scan) {
        System.out.println("Query to find average rating each equipment: ");

        String sql = "SELECT    EQUIPMENT.serial_number AS equipment_num, AVG(rating) AS avg_rating\n"
                + "    FROM      REVIEW, EQUIPMENT\n"
                + "    WHERE     REVIEW.serial_number = EQUIPMENT.serial_number\n"
                + "    GROUP BY EQUIPMENT.serial_number;";
        try {
            PreparedStatement stmt = DBConnection.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(
                        "Equipment serial number: " + rs.getInt("equipment_num")
                                + "\nrating: " + rs.getDouble("avg_rating"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    private static void extraQuery5(Scanner scan) {
        System.out.println("Query to find the top three pieces of equipment: ");

        String sql = "SELECT serial_number, COUNT(*) AS total\n"
                + "FROM   WAREHOUSE_ORDER AS W, EQUIPMENT AS E\n"
                + "WHERE  W.order_number = E.order_number\n"
                + "    GROUP BY E.serial_number\n" + "    ORDER BY total\n"
                + "    LIMIT 3;";
        try {
            PreparedStatement stmt = DBConnection.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(
                        "Equipment serial number: " + rs.getInt("serial_num")
                                + "\nrating: " + rs.getDouble("avg_rating"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
