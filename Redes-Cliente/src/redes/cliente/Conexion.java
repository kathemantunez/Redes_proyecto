/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redes.cliente;

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
       /*String url="jdbc:sqlserver://KATHERINE\\MSSQLSERVER01:1433;databaseName=Pizza;"
               + "user=kk;password=kk;";
        try {
            System.out.println("paso1");
            Connection con=DriverManager.getConnection(url);
            System.out.println("paso2");
            return con;
            //Statement st=con.createStatement();
           // ResultSet rs=st.executeQuery(url)
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
       -*/
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
