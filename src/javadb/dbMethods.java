package javadb;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Josh
 */
public class dbMethods {
    
    static final String DB_URL = "jdbc:derby://localhost:1527/myDB";
    static final String USER = "root";
    static final String PASS = "root";
    
    //Creates a connection to the database and returns true if the connection is up
    public static boolean connect() throws Exception{
        boolean success = false;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con=DriverManager.getConnection(DB_URL, USER, PASS);   
        if (!con.isClosed()) {
            success = true;
        }
        return success;
    }
    
}
