package cse3241;

import java.sql.Connection;

public class DBConnection {

    public static Connection conn;

    public static void setConn(Connection newConn) {
        conn = newConn;
    }

}
