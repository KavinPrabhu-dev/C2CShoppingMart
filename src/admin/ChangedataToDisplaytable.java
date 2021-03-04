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


public class ChangedataToDisplaytable {

    void display(String userid, String productname, int cost,String brand, String description, String status, String type, String postid) {
        try {
            String s1 = userid, s2 = productname;int s3 = cost;String s4 = brand, s5 = description, s6 = status, s7 = type,s8=postid;
            System.out.println(s1);
            Connection con = AdminDatabase.getConnection();
            Statement st = con.createStatement();
            String query = "insert into displaytable (user_id,p_name,cost,brand,descrip,status,type,post_id) values(?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, s1);
            pstmt.setString(2, s2);
            pstmt.setInt(3, s3);
            pstmt.setString(4, s4);
            pstmt.setString(5, s5);
            pstmt.setString(6, s6);
            pstmt.setString(7, s7);
            pstmt.setString(8, s8);
            pstmt.executeUpdate();
            st.executeUpdate("update displaytable,producttable set displaytable.image=producttable.image,displaytable.date = producttable.date where displaytable.user_id = '" + s1 + "' and producttable.p_name = displaytable.p_name");
            con.close();
            new OptionPane("Inserted Sucessfully");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    void image(String imguserid) {
        try {
            System.out.println(imguserid);
            Connection con = AdminDatabase.getConnection();
            Statement st = con.createStatement();
            con.close();
            new OptionPane("Image Update Sucessfully");

        } catch (Exception a) {
            new OptionPane("ErrorOccured while Inserting image Data!!");
        }

    }

    class OptionPane {

        JFrame frame;

        OptionPane(String str) {
            frame = new JFrame("DataTransferTable");
            JOptionPane.showMessageDialog(frame, str, "Please Check", JOptionPane.WARNING_MESSAGE);
        }
    }

}

/*
try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/s4s", "root", "");
                        Statement st = conn.createStatement();
                        
                          ResultSet insval=st.executeQuery("select * from displaytable where p_name='"+pname+"' AND brand='"+brnd+"' AND status='approved'");
                          while(insval.next())
                          {
                           pstuid=insval.getString("user_id");
                           pname1=insval.getString("p_name");
                           brnd1=insval.getString("brand");
                           pcost1=insval.getString("cost");
                           descn=insval.getString("descrip");
                           imgb=insval.getBlob("image");
                           byte[] ib=insval.getBytes("image");
                           String query1="update producttable,displaytable set producttable.image=displaytable.image where producttable.user_id='"+us1+"' AND producttable.post_id=displaytable.user_id AND producttable.p_name=displaytable.p_name AND producttable.brand=displaytable.brand";
                           String query="insert into producttable(user_id,post_id,p_name,brand,cost,descrip,date,type,status) values('"+us1+"','"+pstuid+"','"+pname1+"','"+brnd1+"','"+pcost1+"','"+descn+"','"+sqlDate+"','order','no')";
                           PreparedStatement pstmt=conn.prepareStatement(query);
                           PreparedStatement pupd=conn.prepareStatement(query1);
                           ResultSet vs=st.executeQuery("select * from producttable where user_id='"+us1+"'and status='no'");
                           while(vs.next())
                           {
                            if((pname.equals(vs.getString("p_name")))&&(brnd.equals(vs.getString("brand")))&&(pstuid.equals(vs.getString("post_id"))&&("no".equals(vs.getString("status")))))
                                  {
                                    tf=true;
                                  }
                           }
                           if(tf==false)
                           {
                               pstmt.execute();
                               pupd.execute();
                           }
                          }
                          System.out.println("postid:"+pstuid);
                          
                          
                         
                            
                          

                        conn.close();
                        System.out.println("Success!");
                    } catch (Exception e) {
                        System.out.println("     " + e);
                    }
*/
