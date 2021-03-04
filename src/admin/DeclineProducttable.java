/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;



import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class DeclineProducttable {

    void decline(String userid, String productname, int cost,String brand, String description, String status, String type, String postid) {
        try {
            String s1 = userid, s2 = productname;int s3 = cost;String s4 = brand, s5 = description, s6 =status, s7 = type,s8=postid;
            Connection con = AdminDatabase.getConnection();
            Statement st = con.createStatement();
            String query = "update producttable set descrip=?,status=? where user_id=? and p_name=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, s5);
            pstmt.setString(2, s6);
            pstmt.setString(3, s1);
            pstmt.setString(4, s2);
            pstmt.executeUpdate();
            con.close();
            new OptionPane("Declined Sucessfully");
        } catch(SQLException ex) {
            System.out.println(ex);
        }
    }

    class OptionPane {

        JFrame frame;

        OptionPane(String str) {
            frame = new JFrame("Decline Table");
            JOptionPane.showMessageDialog(frame, str, "Please Check", JOptionPane.WARNING_MESSAGE);
        }
    }

}
