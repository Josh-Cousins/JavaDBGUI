package javadb;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Josh
 */
public class dbMethods {
    
    //Creates a connection to the database and returns true if the connection is up
    public static boolean connect() throws Exception{
        boolean success = false;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/myDB","root","root");   
        if (!con.isClosed()) {
            success = true;
        }
        return success;
    }
    
}
