/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.*;


public class ConnectionProvider {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello");
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay","root","123456789");
            System.out.println(conn);
            String query = "SELECT * FROM homestay.login";

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {
                String name = rs.getString("name");
                System.out.println(name);
            }
            st.close();

        }
        catch(SQLException ex){
            System.out.println("error");
        }
    }
    
}
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
///**
// *
//
// */
//public class ConnectionProvider {
//    public static Connection getCon(){
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay","root","123456789");
//            System.out.println("ket noi thanh cong");
//            return con;
//        } catch (SQLException | ClassNotFoundException ex) {
//            
//        }
//        return null;
//    }
//    
//}