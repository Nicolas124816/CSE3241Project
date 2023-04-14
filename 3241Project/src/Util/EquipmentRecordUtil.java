package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Input.DateHelper;
import cse3241.DBConnection;

public class EquipmentRecordUtil {

    public static void addRecord(Scanner scan) {
        //item stuff
        System.out.println("Enter the serial number: ");
        int serial_num = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the model number: ");
        int modelNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the item description: ");
        String desc = scan.nextLine();
        System.out.println("Enter the id of the warehouse it's stored in: ");
        int warehouseID = scan.nextInt();
        scan.nextLine();
        //order number null by default
        System.out.println(
                "Enter the expiration date (yyyy-mm-dd) of the item: ");
        String date = scan.nextLine();

        //item_model stuff
        System.out.println("Enter the year of release of the item: ");
        int year = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the manufacturer of the item: ");
        String manufacturer = scan.nextLine();

        //equipment stuff
        System.out.println("Enter the equipment type: ");
        String type = scan.nextLine();
        System.out.println("Enter the weight (int): ");
        int weight = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the size (int): ");
        String size = scan.nextLine();

        Connection conn = DBConnection.conn;
        try {
            PreparedStatement stmt1 = conn.prepareStatement(
                    "INSERT INTO Drone values (?, ?, ?, ?, ?, ?, ?)");
            stmt1.setInt(1, serial_num);
            stmt1.setString(2, type);
            stmt1.setInt(3, weight);
            stmt1.setString(4, size);
            stmt1.setNull(5, java.sql.Types.NULL);
            stmt1.execute();

            PreparedStatement stmt2 = conn.prepareStatement(
                    "INSERT INTO ITEM values (?, ?, ?, ?, ?, ?)");
            stmt2.setInt(1, serial_num);
            stmt2.setInt(2, modelNumber);
            stmt2.setString(3, desc);
            stmt2.setInt(4, warehouseID);
            stmt2.setNull(5, java.sql.Types.NULL); //order num null by default
            stmt2.setDate(6, DateHelper.getDate(date));
            stmt2.execute();

            PreparedStatement stmt3 = conn.prepareStatement(
                    "INSERT INTO Item_Model values (?, ?, ?)");
            stmt3.setInt(1, modelNumber);
            stmt3.setInt(2, year);
            stmt3.setString(3, manufacturer);
            stmt3.execute();

            System.out.println(
                    "Added new equipment with serial number: " + serial_num);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void deleteRecord(Scanner scan) {
        System.out
                .println("Specify the serial number of the drone to delete: ");
        int serial_num = scan.nextInt();
        scan.nextLine();

        try {
            PreparedStatement getModel = DBConnection.conn.prepareStatement(
                    "SELECT model_number FROM Item WHERE serial_number=?");
            getModel.setInt(1, serial_num);
            ResultSet rs = getModel.executeQuery();
            rs.next();
            int modelNumber = rs.getInt("model_number");

            PreparedStatement stmt1 = DBConnection.conn.prepareStatement(
                    "DELETE FROM Equipment WHERE serial_number=?;");
            stmt1.setInt(1, serial_num);
            stmt1.execute();

            PreparedStatement stmt2 = DBConnection.conn
                    .prepareStatement("DELETE FROM Item WHERE serial_number=?");
            stmt2.setInt(1, serial_num);
            stmt2.execute();

            PreparedStatement stmt3 = DBConnection.conn.prepareStatement(
                    "DELETE FROM Item_Model WHERE model_number=?");
            stmt3.setInt(1, modelNumber);
            stmt3.execute();

            System.out.println(
                    "Deleted equipment with serial number: " + serial_num);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateRecord(Scanner scan) {
        System.out.println(
                "Specify the serial number of the equipment to update: ");
        int oldSerial = scan.nextInt();
        scan.nextLine();
        System.out.println("Specify new values for the record: ");
        //item stuff
        System.out.println("Enter the serial number: ");
        int serial_num = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the model number: ");
        int modelNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the item description: ");
        String desc = scan.nextLine();
        System.out.println("Enter the id of the warehouse it's stored in: ");
        int warehouseID = scan.nextInt();
        scan.nextLine();
        //order number null by default
        System.out.println(
                "Enter the expiration date (yyyy-mm-dd) of the item: ");
        String date = scan.nextLine();

        //item_model stuff
        System.out.println("Enter the year of release of the item: ");
        int year = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the manufacturer of the item: ");
        String manufacturer = scan.nextLine();

        //equipment stuff
        System.out.println("Enter the equipment type: ");
        String type = scan.nextLine();
        System.out.println("Enter the weight (int): ");
        int weight = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the size: ");
        String size = scan.nextLine();

        Connection conn = DBConnection.conn;

        try {
            PreparedStatement getModel = DBConnection.conn.prepareStatement(
                    "SELECT model_number FROM Item WHERE serial_number=?");
            getModel.setInt(1, oldSerial);
            ResultSet rs = getModel.executeQuery();
            rs.next();
            int oldModelNumber = rs.getInt("model_number");

            PreparedStatement stmt1 = DBConnection.conn
                    .prepareStatement("UPDATE Equipment"
                            + "SET serial_number=?, type=?, weight=?, size=?, order_number=?, status=?, fleet_id=?\n"
                            + "WHERE serial_number=?;");
            stmt1.setInt(1, serial_num);
            stmt1.setString(2, type);
            stmt1.setInt(3, weight);
            stmt1.setString(4, size);
            stmt1.setNull(5, java.sql.Types.NULL); //order num null by default
            stmt1.setInt(6, oldSerial);
            stmt1.execute();

            PreparedStatement stmt2 = conn.prepareStatement("UPDATE Item "
                    + "SET serial_number=?, model_number=?, description=?, warehouse_id=?, order_number=?, exp_date=?\n"
                    + "WHERE serial_number=?");
            stmt2.setInt(1, serial_num);
            stmt2.setInt(2, modelNumber);
            stmt2.setString(3, desc);
            stmt2.setInt(4, warehouseID);
            stmt2.setNull(5, java.sql.Types.NULL); //order num null by default
            stmt2.setDate(6, DateHelper.getDate(date));
            stmt2.setInt(7, oldSerial);
            stmt2.execute();

            PreparedStatement stmt3 = conn.prepareStatement("UPDATE Item_Model"
                    + "SET model_number=?, year=?, manufacturer=?\n"
                    + "WHERE model_number=?");
            stmt3.setInt(1, modelNumber);
            stmt3.setInt(2, year);
            stmt3.setString(3, manufacturer);
            stmt3.setInt(4, oldModelNumber);
            stmt3.execute();

            System.out.println(
                    "Updated equipment with serial number: " + serial_num);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void searchRecord(Scanner scan) {
        System.out.println(
                "Specify the serial number of the equipment to search: ");
        int serial_number = scan.nextInt();
        scan.nextLine();
        Connection conn = DBConnection.conn;
        try {
            PreparedStatement getModel = DBConnection.conn.prepareStatement(
                    "SELECT model_number FROM Item WHERE serial_number=?");
            getModel.setInt(1, serial_number);
            ResultSet rs = getModel.executeQuery();
            rs.next();
            int modelNumber = rs.getInt("model_number");
            rs.close();

            PreparedStatement stmt1 = DBConnection.conn.prepareStatement(
                    "SELECT * FROM Equipment\n WHERE serial_number=?");
            stmt1.setInt(1, serial_number);
            ResultSet rSet = stmt1.executeQuery();
            rSet.next(); //only one entry will be returned, searching by key
            String type = rSet.getString("type");
            String size = rSet.getString("size");
            int weight = rSet.getInt("weight");
            rSet.close();
            stmt1.close();

            PreparedStatement stmt2 = conn.prepareStatement(
                    "SELECT * FROM Item WHERE serial_number=?");
            stmt2.setInt(1, serial_number);
            rs = stmt2.executeQuery();
            rs.next();
            String description = rs.getString("description");
            int warehouseID = rs.getInt("warehouse_id");
            Integer orderNumber = rs.getInt("order_number"); //could be null
            String expDate = rs.getString("exp_date");
            rs.close();

            PreparedStatement stmt3 = conn.prepareStatement(
                    "SELECT * FROM Item_Model WHERE model_number=?");
            stmt3.setInt(1, modelNumber);
            rs = stmt3.executeQuery();
            rs.next();
            int year = rs.getInt("year");
            String manufacturer = rs.getString("manufacturer");

            System.out.println("Found equipment: ");
            System.out.println("Serial number: " + serial_number);
            System.out.println("Model number: " + modelNumber);
            System.out.println("Description: " + description);
            System.out.println("Warehouse id:" + warehouseID);
            System.out.println("Order number: " + orderNumber);
            System.out.println("Expiration date: " + expDate);
            System.out.println("Year: " + year);
            System.out.println("Manufacturer: " + manufacturer);
            System.out.println("Type: " + type);
            System.out.println("Weight: " + weight);
            System.out.println("Size: " + size);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
