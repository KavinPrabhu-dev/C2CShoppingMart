package myposts;

import project2.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static team4shopping.User_login.Uuserid;

public class Search1 {

    static int electronics = 0;

    public static ArrayList<ProductList> mobileSearch(String model) {
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/electronicsdb", "root", "");
            //Connection con = DriverManager.getConnection("jdbc:sqlite:E:/electronicsDB.db");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM producttable WHERE brand=? OR p_name=? and user_id= '"+Uuserid+"' and status='yes' and type='order'");
            ps.setString(1, model);
            ps.setString(2, model);
            ResultSet rs = ps.executeQuery();

            ProductList pl;

            while (rs.next()) {
                pl = new ProductList(rs.getString("brand"), rs.getString("p_name"),
                        rs.getInt("cost"), rs.getString("descrip"),
                        rs.getBytes("image"));
                electronics++;

                list.add(pl);

            }
            con.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ElectronicsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
