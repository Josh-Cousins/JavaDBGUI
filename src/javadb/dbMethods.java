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
        
        Connection con=DriverManager.getConnection(DB_URL, USER, PASS);   
        if (!con.isClosed()) {
            success = true;
        }
        return success;
    }
    
    /*Executes a specific sql statement with given paramaters depending on what
    mode the method is running in - the correct order for params list is given
    above the statement*/
    public static boolean updateDB(int mode, ArrayList<Object> params){
        boolean success = false;
        //try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = con.createStatement();
            String sql = "";
            switch(mode){
                case mainFrame.UPDATE_PRODUCT:
                    break;
                case mainFrame.UPDATE_MAN:
                    //0 - newName | 1 - manID
                    sql = "UPDATE manufacturers SET manname = "+"'"+params.get(0)+"'"+" WHERE MANID = "+params.get(1);
                    System.out.println(sql);    
                    break;
                case mainFrame.DELETE_PRODUCT:
                    break;
                case mainFrame.DELETE_MAN:
                    break;
                case mainFrame.ADD_PRODUCT:
                    break;
                case mainFrame.ADD_MAN:
                    break;
                }
            stmt.executeUpdate(sql);
            stmt.close();
            }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
 
        return success;
    }
    
}
