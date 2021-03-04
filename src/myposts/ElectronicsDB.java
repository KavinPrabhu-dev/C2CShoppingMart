package myposts;

import project2.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static team4shopping.User_login.Uuserid;


public class ElectronicsDB {
    
    public static ArrayList<ProductList> TableGenerator(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
             Class.forName("com.mysql.jdbc.Driver");

             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/electronicsdb", "root","");
            //Connection con = DriverManager.getConnection("jdbc:sqlite:E:/electronicsDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT brand, p_name, cost, descrip, image FROM producttable where user_id= '"+Uuserid+"' and type='post'");
            
            ProductList pl;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("brand"),rs.getString("p_name"),
                        rs.getInt("cost"),rs.getString("descrip"),
                        rs.getBytes("image"));
                
                list.add(pl);

            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ElectronicsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        }
   public static ArrayList<ProductList> homePageContent(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
             Class.forName("com.mysql.jdbc.Driver");

             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/electronicsdb", "root","");
            //Connection con = DriverManager.getConnection("jdbc:sqlite:E:/electronicsDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT brand, p_name, cost, descrip, image FROM producttable where user_id= '"+Uuserid+"' and type='post' ORDER BY date DESC LIMIT 3");
            
            ProductList pl;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("brand"),rs.getString("p_name"),
                        rs.getInt("cost"),rs.getString("descrip"),
                        rs.getBytes("image"));
                
                list.add(pl);

            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ElectronicsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
    
}
