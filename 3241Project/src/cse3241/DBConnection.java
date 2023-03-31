package cse3241;

import java.sql.Connection;

public class DBConnection {

    public static Connection conn;

    static void setConn(Connection conn) {
        DBConnection.conn = conn;
    }

}
