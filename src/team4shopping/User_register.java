package team4shopping;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.regex.Pattern;
import javax.swing.*;

public class User_register {

    public static JFrame reg = new JFrame();
    //public static void main(String[] args) {
    String strr = "C:\\Users\\USER\\Documents\\NetBeansProjects\\integration\\src\\images\\";

    void register() {
        int x, y;
        reg = new JFrame("Login&Register");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screenSize.getWidth() - reg.getWidth()) / 2);
        y = (int) ((screenSize.getHeight() - reg.getHeight()) / 2);
        reg.setLocation(x - 400, y - 420);

        reg.setBackground(Color.LIGHT_GRAY);
        Font f = new Font("SansSerif", Font.ROMAN_BASELINE, 17);
        Font f1 = new Font("SansSerif", Font.ROMAN_BASELINE, 20);
        Font tit = new Font("Calibri", Font.PLAIN, 35);
        JLabel title = new JLabel("                                            Surety 4 Shopping");
        title.setFont(tit);
        title.setForeground(Color.white);
        title.setOpaque(true);
        title.setBackground(new Color(0, 84, 220));

        Icon titleicon = new ImageIcon(strr + "title.png");
        JLabel ititle = new JLabel(titleicon);
        Icon icon1 = new ImageIcon(strr + "username.png");
        JLabel iuserid = new JLabel(icon1);
        JLabel l1 = new JLabel("User ID");
        l1.setFont(f);

        Icon icon2 = new ImageIcon(strr + "userid.png");
        JLabel iusername = new JLabel(icon2);
        JLabel l2 = new JLabel("Customer Name");
        l2.setFont(f);

        Icon icon3 = new ImageIcon(strr + "password.png");
        JLabel ipassword = new JLabel(icon3);
        JLabel l3 = new JLabel("Password");
        l3.setFont(f);

        Icon icon4 = new ImageIcon(strr + "retypepassword.png");
        JLabel iretypepassword = new JLabel(icon4);
        JLabel l4 = new JLabel("Re-Type Password");
        l4.setFont(f);

        Icon icon5 = new ImageIcon(strr + "address.png");
        JLabel iaddress = new JLabel(icon5);
        JLabel l5 = new JLabel("Address");
        l5.setFont(f);

        Icon icon6 = new ImageIcon(strr + "location.png");
        JLabel ilocation = new JLabel(icon6);
        JLabel l6 = new JLabel("Landmark");
        l6.setFont(f);

        Icon icon7 = new ImageIcon(strr + "district.png");
        JLabel idistrict = new JLabel(icon7);
        JLabel l7 = new JLabel("District");
        l7.setFont(f);

        Icon icon8 = new ImageIcon(strr + "pincode.png");
        JLabel ipincode = new JLabel(icon8);
        JLabel l8 = new JLabel("Pincode");
        l8.setFont(f);

        Icon icon9 = new ImageIcon(strr + "phone.png");
        JLabel iphone = new JLabel(icon9);
        JLabel l9 = new JLabel("Phone Number");
        l9.setFont(f);

        Icon icon10 = new ImageIcon(strr + "al_phone.png");
        JLabel ial_phone = new JLabel(icon10);
        JLabel l10 = new JLabel("Alternate Ph-no");
        l10.setFont(f);
        JLabel l11 = new JLabel("Back to Login");
        l11.setFont(f);

        JTextField t1 = new JTextField();
        t1.setFont(f1);
        JTextField t2 = new JTextField();
        t2.setFont(f1);
        JPasswordField t3 = new JPasswordField();
        t3.setFont(f1);
        JPasswordField t4 = new JPasswordField();
        t4.setFont(f1);
        JTextArea t5 = new JTextArea();
        t5.setFont(f1);
        JTextField t6 = new JTextField();
        t6.setFont(f1);
        JTextField t7 = new JTextField();
        t7.setFont(f1);
        JTextField t8 = new JTextField();
        t8.setFont(f1);
        JTextField t9 = new JTextField();
        t9.setFont(f1);
        JTextField t10 = new JTextField();
        t10.setFont(f1);

        JButton b1 = new JButton("Re-set");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = null;
                t1.setText(a);
                t2.setText(a);
                t3.setText("");
                t4.setText("");
                t5.setText(a);
                t6.setText(a);
                t7.setText(a);
                t8.setText(a);
                t9.setText(a);
                t10.setText(a);
            }
        });

        JButton b2 = new JButton("Register");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name, password, re_type, address, location, district, pincode, userid;
                userid = t1.getText();
                name = t2.getText();
                password = t3.getText();
                re_type = t4.getText();
                address = t5.getText();
                location = t6.getText();
                district = t7.getText();
                pincode = t8.getText();
                String phone = t9.getText();
                String al_phone = t10.getText();
                String check = "1";
                String check1 = "1";
                String check2 = "1";

                if (userid.equals("")) {
                    new OptionPane("UserID Cant be Empty");
                } else if (name.equals("")) {
                    new OptionPane("UserName Cant be Empty");
                } else if (password.equals("")) {
                    new OptionPane("Password cant't be Empty");
                } else if (re_type.equals("")) {
                    new OptionPane("Re-Password cant't be Empty");
                } else if (phone.equals("") || al_phone.equals("")) {
                    new OptionPane("PhoneNumber Cant be Empty");
                } else if (phone.length() > 10 || phone.length() < 10 || al_phone.length() < 10 || al_phone.length() > 10) {
                    new OptionPane("Phone number should be 10digit");
                } else if (address.equals("") || address.length() < 20) {
                    new OptionPane("Adrress can't be empty or Give valid address");
                } else if (location.equals("") || location.length() < 10) {
                    new OptionPane("Landmark can't be empty or enter proper LandMark name");
                } else if (district.equals("") || district.length() < 5) {
                    new OptionPane("District can't be empty or enter proper District name");
                } else if (pincode.equals("")) {
                    new OptionPane("pin code cant be empty");
                } else if (password.length() > 14 || re_type.length() > 14) {
                    new OptionPane("Password length should be less than 14");
                } else if (pincode.length() != 6) {
                    new OptionPane("Pin Code Should be in 6 digit");
                } else {
                    try {
                        String numbers = "(.[0-9].)";
                        if (phone.matches(numbers)) {
                            check = "12";
                        }
                    } catch (NumberFormatException pho) {
                        new OptionPane("Phone Number Should be number");

                    }
                    try {
                        String numbers = "(.[0-9].)";
                        if (al_phone.matches(numbers)) {
                            check1 = "12";
                        }
                    } catch (NumberFormatException pho) {
                        new OptionPane("Alternate-Phone Number should be number");
                    }
                    try {
                        String numbers = "(.*[0-9].*)";
                        if (pincode.matches(numbers)) {
                            check2 = "12";
                        }
                    } catch (NumberFormatException pho) {
                        new OptionPane("Pincode Number should be number");
                    }
                }

                boolean passwordvalid = false;
                if (check1.equals(check) && check1.equals(check2)) {
                    if (password.equals(re_type)) {
                        User_Password_Validation pws = new User_Password_Validation();
                        passwordvalid = pws.passwordvalid(password);
                        if (passwordvalid == true) {
                            //establish connection with database
                            try {
                                String s1 = userid, s2 = name, s3 = password, s4 = address, s5 = location, s6 = district, s7 = pincode, s8 = phone, s9 = al_phone;
                                s3 = PasswordEncription.encript(s3);
                                Connection con = Database.getConnection();
                                Statement st = con.createStatement();
                                String query = "insert into user_register_form values(?,?,?,?,?,?,?,?,?)";
                                PreparedStatement pstmt = con.prepareStatement(query);
                                pstmt.setString(1, s1);
                                pstmt.setString(2, s2);
                                pstmt.setString(3, s3);
                                pstmt.setString(4, s4);
                                pstmt.setString(5, s5);
                                pstmt.setString(6, s6);
                                pstmt.setString(7, s7);
                                pstmt.setString(8, s8);
                                pstmt.setString(9, s9);
                                pstmt.executeUpdate();
                                con.close();
                                new OptionPane("Registered Sucessfully");

                                reg.setVisible(false);
                                User_login.login();
                            } catch (Exception a) {
                                new OptionPane("UserId Already exist");

                            }

                        }
                    } else {
                        new OptionPane("Password and ReTyped Password DoesNot Matched");
                    }
                } else {
                    new OptionPane("Please check Your Phone Number");
                }

            }

        });
        Icon ibacktologin = new ImageIcon(strr + "backtologin.png");
        JButton b3 = new JButton(ibacktologin);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reg.setVisible(false);
                User_login a = new User_login();
                a.login();

            }
        });

        title.setBounds(0, 0, 800, 80);
        ititle.setBounds(700, -60, 300, 200);

        iuserid.setBounds(230, 100, 30, 30);
        iusername.setBounds(230, 150, 30, 30);
        ipassword.setBounds(230, 200, 30, 30);
        iretypepassword.setBounds(230, 250, 30, 30);
        iaddress.setBounds(230, 290, 30, 30);
        ilocation.setBounds(230, 410, 30, 30);
        idistrict.setBounds(230, 460, 30, 30);
        ipincode.setBounds(230, 510, 30, 30);
        iphone.setBounds(230, 550, 30, 30);
        ial_phone.setBounds(230, 600, 30, 30);

        l1.setBounds(260, 110, 135, 17);
        l2.setBounds(260, 160, 135, 17);
        l3.setBounds(260, 210, 135, 17);
        l4.setBounds(260, 250, 140, 19);
        l5.setBounds(260, 300, 135, 17);
        l6.setBounds(260, 420, 135, 17);
        l7.setBounds(260, 470, 135, 17);
        l8.setBounds(260, 520, 135, 17);
        l9.setBounds(260, 560, 135, 17);
        l10.setBounds(260, 610, 135, 17);
        l11.setBounds(410, 720, 135, 19);

        t1.setBounds(500, 100, 190, 30);
        t2.setBounds(500, 150, 190, 30);
        t3.setBounds(500, 200, 190, 30);
        t4.setBounds(500, 240, 190, 30);
        t5.setBounds(500, 290, 190, 90);
        t6.setBounds(500, 410, 190, 30);
        t7.setBounds(500, 460, 190, 30);
        t8.setBounds(500, 510, 190, 30);
        t9.setBounds(500, 560, 190, 30);
        t10.setBounds(500, 610, 190, 30);

        b1.setBounds(260, 660, 135, 40);
        b2.setBounds(525, 660, 135, 40);
        b3.setBounds(420, 660, 80, 60);
        reg.add(title);
        reg.add(ititle);
        reg.add(iuserid);
        reg.add(iusername);
        reg.add(ipassword);
        reg.add(iretypepassword);
        reg.add(iaddress);
        reg.add(ilocation);
        reg.add(idistrict);
        reg.add(ipincode);
        reg.add(iphone);
        reg.add(ial_phone);
        reg.add(l1);
        reg.add(l2);
        reg.add(l3);
        reg.add(l4);
        reg.add(l5);
        reg.add(l6);
        reg.add(l7);
        reg.add(l8);
        reg.add(l9);
        reg.add(l10);
        reg.add(l11);
        reg.add(t1);
        reg.add(t2);
        reg.add(t3);
        reg.add(t4);
        reg.add(t5);
        reg.add(t6);
        reg.add(t7);
        reg.add(t8);
        reg.add(t9);
        reg.add(t10);
        reg.add(b1);
        reg.add(b2);
        reg.add(b3);
        reg.setSize(930, 900);
        reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        reg.setLayout(null);
        reg.setVisible(true);

    }

}

class a {

    class OptionPane {

        JFrame frame;

        OptionPane(String str) {
            frame = new JFrame("User Register Form");
            JOptionPane.showMessageDialog(frame, str, "Please Check", JOptionPane.WARNING_MESSAGE);
        }
    }

}
