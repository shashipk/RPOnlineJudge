/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package judge;

import java.sql.*;

/**
 *
 * @author Avishek
 */
class MySqlConnect {
    Connection conn = null ;
    public static Connection connection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/data1","root","proxyyy");
            System.out.println("Connected to Databse");
            return conn;
        }
        catch(Exception e)
        {
            System.out.println("Exception in creatting database");
            return null;
        }
    }
}
