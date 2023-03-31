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
            default:
                System.out.println("You didn't enter a valid option");
        }
    }

    private static void extraQuery1(Scanner scan) {
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

}
