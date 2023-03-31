package cse3241;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import Input.InputHelper;
import Util.ExtraQueries;
import Util.RecordUtil;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String url = "jdbc:sqlite:" + "checkpoint4.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            if (conn != null) {
                // Provides some positive assurance the connection and/or creation was successful.
                DatabaseMetaData meta = conn.getMetaData();
                System.out
                        .println("The driver name is " + meta.getDriverName());
                System.out.println(
                        "The connection to the database was successful.");
            } else {
                // Provides some feedback in case the connection failed but did not throw an exception.
                System.out.println("Null Connection");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out
                    .println("There was a problem connecting to the database.");
        }
        DBConnection.setConn(conn);
        while (true) {
            int operation = InputHelper.getOperationOption(scan);
            switch (operation) {
                case 1:
                    RecordUtil.addRecord(scan);
                    break;
                case 2:
                    RecordUtil.deleteRecord(scan);
                    break;
                case 3:
                    RecordUtil.searchRecord(scan);
                    break;
                case 4:
                    RecordUtil.updateRecord(scan);
                    break;
                case 5:
                    ExtraQueries.runExtraQueries(scan);
                    break;
                default:
                    System.out.println(
                            "You entered an incorrect operation option");
                    continue;

            }

        }

    }

}
