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
        System.out.println("Enter Review_Number: ");
        int Review_Number = scan.nextInt();
        System.out.println("Enter rating: ");
        double rating = scan.nextDouble();
        System.out.println("Enter the comment: ");
        String comment = scan.nextLine();
        scan.nextLine();

        Review added = new Review();
        added.setComment(comment);
        added.setRating(rating);

        System.out.println("Added new review: \n" + added.toString());
        Connection conn = DBConnection.conn;
        try {
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO Employee (Review_Number, rating, comment) values (?, ?, ?)");
            stmt.setInt(1, Review_Number);
            stmt.setDouble(2, rating);
            stmt.setString(3, comment);
            stmt.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void deleteRecord(Scanner scan) {
        Review delete = searchRecord(scan);
        try {
            PreparedStatement stmt1 = DBConnection.conn.prepareStatement(
                    "DELETE FROM Review WHERE Review_Number=?;");
            //stmt1.setString(1, delete.getReviewNumber());
            stmt1.execute();

            System.out.println("Deleted Review: \n" + delete.toString());
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateRecord(Scanner scan) {
        Review update = searchRecord(scan);
        System.out.println("Enter Review_Number: ");
        int Review_Number = scan.nextInt();
        System.out.println("Enter rating: ");
        double rating = scan.nextDouble();
        System.out.println("Enter the comment: ");
        String comment = scan.nextLine();
        scan.nextLine();

        try {
            PreparedStatement stmt = DBConnection.conn.prepareStatement(
                    "UPDATE Review SET rating = ? , comment = ? WHERE Review_Number = ?");
            stmt.setDouble(1, rating);
            stmt.setString(2, comment);
            stmt.setInt(3, Review_Number);
            stmt.execute();

            System.out.println("updated review: \n" + update.toString());
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static Review searchRecord(Scanner scan) {
        System.out.println("Specify the review number of the review: ");
        String reviewNum = scan.nextLine();
        Connection conn = DBConnection.conn;
        Review found = null;
        try {
            System.out.println(conn.getMetaData());

            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT rating, comment FROM Review WHERE Review_Number=?");
            stmt.setString(1, reviewNum);
            ResultSet rSet = stmt.executeQuery();
            rSet.next();
            double rating = rSet.getDouble("rating");
            String comment = rSet.getString("comment");
            Review newRv = new Review();
            newRv.setComment(comment);
            newRv.setRating(rating);
            return newRv;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return found;
    }
}
