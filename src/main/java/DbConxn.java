
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HNC
 */
public class DbConxn {
    protected static Connection initializeDatabase() throws SQLException , ClassNotFoundException{
        Class.forName("org.apache.derby.jdbc.EmbeddedDrive");
        String url="jdbc:derby://localhost:1527/sample [app on APP]";
        String user="Divija";
        String password="12345";
        Connection con=DriverManager.getConnection(url,user,password);
        return con;
    }
    
}
