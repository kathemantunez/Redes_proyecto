/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redes_restaurante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author KATHERINE
 */
public class Conexion {
    static Connection contacto=null;
    public static Connection getConnection() throws ClassNotFoundException,SQLException{
       
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       String url="jdbc:sqlserver://KATHERINE\\MSSQLSERVER01:1433;database=Pizza;user=kk;password=kk;";
       Connection con= DriverManager.getConnection(url);
       System.out.println("se conectó esta papada");
       return con;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
       
        
    }
    
}
