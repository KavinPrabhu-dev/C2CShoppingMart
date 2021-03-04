package team4shopping;

import project2.*;
import admin.*;

//check 71 to call next class
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Admin_login {

    //public static void main(String[] args) {

    void login() {
        String strr = "C:\\Users\\USER\\Documents\\NetBeansProjects\\integration\\src\\images\\";
        JFrame frame = new JFrame("Admin Login");
        int x, y;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screenSize.getWidth() - frame.getWidth()) / 2);
        y = (int) ((screenSize.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x - 200, y - 400);
        Icon icon1 = new ImageIcon(strr + "admin.png");
        Icon image2 = new ImageIcon(strr + "login.png");
        Icon image3 = new ImageIcon(strr + "home.png");
        JButton reset = new JButton(icon1);

        Font f = new Font("SansSerif", Font.ROMAN_BASELINE, 17);
        Font f1 = new Font("SansSerif", Font.ROMAN_BASELINE, 20);
        Font tit = new Font("Calibri", Font.PLAIN, 35);

        JLabel title = new JLabel("                    Surety 4 Shopping");
        title.setFont(tit);
        title.setForeground(Color.white);
        title.setOpaque(true);
        title.setBackground(new Color(0, 84, 220));
        JLabel l1 = new JLabel("Admin ID");
        l1.setFont(f);
        JLabel l2 = new JLabel("Password");
        l2.setFont(f);
        JLabel l3 = new JLabel("Login");
        l3.setFont(f);
        JLabel l4 = new JLabel("Home");
        l4.setFont(f);

        JTextField t1 = new JTextField("");
        t1.setFont(f1);
        JPasswordField t2 = new JPasswordField("");
        t2.setFont(f1);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = null;
                t1.setText(a);
                t2.setText(a);

            }
        });

        JButton button1 = new JButton(image2);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //establish connection with database
                    String Userid = t1.getText(), Passcode = t2.getText();
                    Connection con = Database.getConnection();
                    String sql = "select * from admin_register_form";
                    PreparedStatement pst = con.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        String u1 = rs.getString("userid");
                        String p1 = rs.getString("password");
                        System.out.println(u1 + "  " + p1);
                        if (Userid.equals(u1)) {
                            if (Passcode.equals(p1)) {
                                new OptionPane("Verified");
                                //next class calling
                                ProductController register = new ProductController();
                                register.adminpannel();
                                frame.setVisible(false);
                                break;
                            } else {
                                new OptionPane("Admin-id and Password not matched");
                             //frame.setVisible(false);
                                //next java class..................................

                                break;
                            }
                        } else {
                            new OptionPane(" Admin-id does not exist");
                            break;
                        }
                    }
                    con.close();
                } catch (Exception a) {
                    new OptionPane(" Admin-id does not exist");
                }
            }
        });

        JButton button2 = new JButton(image3);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //frame.setVisible(false);
                frame.dispose();
                project2.Main_Page.main(null);
            }
        });
        title.setBounds(0, 0, 800, 80);
        reset.setBounds(220, 90, 100, 100);
        l1.setBounds(80, 250, 100, 30);
        l2.setBounds(80, 290, 100, 30);
        t1.setBounds(290, 250, 200, 30);
        t2.setBounds(290, 290, 200, 30);
        button1.setBounds(100, 350, 60, 60);
        button2.setBounds(310, 350, 60, 60);
        l3.setBounds(110, 420, 100, 30);
        l4.setBounds(310, 420, 100, 30);
        frame.add(title);
        frame.add(reset);
        frame.add(l1);
        frame.add(l2);
        frame.add(t1);
        frame.add(t2);
        frame.add(button1);
        frame.add(button2);
        frame.add(l3);
        frame.add(l4);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        class OptionPane {

            JFrame frame1;

            OptionPane(String str) {
                frame1 = new JFrame("Admin Login");
                JOptionPane.showMessageDialog(frame1, str, "Please Check", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

}
