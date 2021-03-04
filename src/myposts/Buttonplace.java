package myposts;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import postget.*;
import project2.*;
import customer.MainPage1.*;

public class Buttonplace {

    private static final int FRAME_WIDTH = 730;
    private static final int FRAME_HEIGHT = 300;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button1 = new javax.swing.JButton();
        JButton button2 = new javax.swing.JButton();
        JButton button3 = new javax.swing.JButton();
        JButton button4 = new javax.swing.JButton();

        button1.setBounds(40, 80, 120, 60);
        button2.setBounds(180, 80, 130, 60);       
        button3.setBounds(330, 80, 160,60);
        button4.setBounds(510, 80, 140,60);
        panel.setLayout(null);

        panel.add(button1);

        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        frame.add(panel);

        button1.setBackground(new java.awt.Color(51, 102, 255));
        button1.setFont(new java.awt.Font("Roboto", 0, 20));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setToolTipText("My Posts");
        button1.setText("My Posts");
        button1.setBorderPainted(false);
        button1.setContentAreaFilled(false);
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button1.setOpaque(true);
        button2.setBackground(new java.awt.Color(51, 102, 255));
        button2.setFont(new java.awt.Font("Roboto", 0, 20));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setToolTipText("My Orders");
        button2.setText("My Orders");
        button2.setBorderPainted(false);
        button2.setContentAreaFilled(false);
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button2.setOpaque(true);
        button3.setBackground(new java.awt.Color(51, 102, 255));
        button3.setFont(new java.awt.Font("Roboto", 0, 20));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setToolTipText("Need to post");
        button3.setText("Need To Post");
        button3.setBorderPainted(false);
        button3.setContentAreaFilled(false);
        button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button3.setOpaque(true);
        button4.setBackground(new java.awt.Color(51, 102, 255));
        button4.setFont(new java.awt.Font("Roboto", 0, 20));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setToolTipText("Log out");
        button4.setText("Log out");
        button4.setBorderPainted(false);
        button4.setContentAreaFilled(false);
        button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button4.setOpaque(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Mypost1.main(null);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Myorder1.main(null);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Post.main(null);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
              
                Main_Page.main(null);
                //Main_Page.closing();
            }
        });

        int x, y;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screenSize.getWidth() - frame.getWidth()) / 2);
        y = (int) ((screenSize.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x - 200, y - 200);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("C2C Shopping Cart");
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
