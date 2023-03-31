package cse3241;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection conn;

    public static void setConn(Connection newConn) {
        conn = newConn;
    }

    public static void establishConn() {
        try {
            conn = DriverManager
                    .getConnection("jdbc:sqlite:" + "checkpoint4.db");
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
    }

}
