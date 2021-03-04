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


public class ProductController {

    static int index = 0;
     static int count = 0;

    //public static void main(String[] args) {
   public void adminpannel(){
        JFrame frame = new JFrame("Admin Pannel");
        String strr = "C:\\Users\\USER\\Documents\\NetBeansProjects\\integration\\src\\images1\\";
        int x, y;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screenSize.getWidth() - frame.getWidth()) / 2);
        y = (int) ((screenSize.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x - 450, y - 390);

        Font font = new Font("Tahoma", Font.PLAIN, 25);
        JLabel title = new JLabel("                                  Surety 4 Shopping");
        title.setFont(font);
        title.setForeground(Color.white);
        title.setOpaque(true);
        title.setBounds(0, 0, 950, 80);
        title.setBackground(new Color(0, 84, 220));
        
        Icon titleicon = new ImageIcon(strr + "title.png");
        JLabel ititle = new JLabel(titleicon);
        ititle.setBounds(850, -60, 300, 200);
        frame.add(ititle);

        Icon iconuserid = new ImageIcon(strr + "iconuserid.png");
        JLabel userid_icon = new JLabel(iconuserid);
        userid_icon.setBounds(180, 120, 40, 40);
        frame.add(userid_icon);
        
        
        JLabel userid = new JLabel("Userid");
        userid.setFont(font);
        userid.setBounds(240, 120, 100, 30);
        frame.add(userid);
        
        
        Icon iconproductname = new ImageIcon(strr + "iconproductname.png");
        JLabel productname_icon = new JLabel(iconproductname);
        productname_icon.setBounds(180, 180, 40, 40);
        frame.add(productname_icon);

        JLabel productname = new JLabel("Productname");
        productname.setFont(font);
        productname.setBounds(240, 180, 150, 30);
        frame.add(productname);
        
        
        Icon iconcost = new ImageIcon(strr + "iconcost.png");
        JLabel cost_icon = new JLabel(iconcost);
        cost_icon.setBounds(180, 240, 40, 40);
        frame.add(cost_icon);

        JLabel cost = new JLabel("Cost");
        cost.setFont(font);
        cost.setBounds(240, 240, 150, 30);
        frame.add(cost);

        
        Icon icondiscription = new ImageIcon(strr + "icondiscription.png");
        JLabel discription_icon = new JLabel(icondiscription);
        discription_icon.setBounds(180, 300, 40, 40);
        frame.add(discription_icon);
        
        
        JLabel discription = new JLabel("Description");
        discription.setFont(font);
        discription.setBounds(240, 300, 150, 30);
        frame.add(discription);
        
        Icon iconstatus = new ImageIcon(strr + "iconstatus.png");
        JLabel status_icon = new JLabel(iconstatus);
        status_icon.setBounds(180, 460, 40, 40);
        frame.add(status_icon);

        JLabel status = new JLabel("Status");
        status.setFont(font);
        status.setBounds(240, 460, 150, 30);
        frame.add(status);

        JLabel duserid = new JLabel("DataNotLoaded");
        duserid.setFont(font);
        duserid.setBounds(500, 120, 200, 30);
        frame.add(duserid);

        JTextField dproductname = new JTextField("");
        dproductname.setFont(font);
        dproductname.setBounds(500, 180, 200, 30);
        frame.add(dproductname);

        JTextField dcost = new JTextField("");
        dcost.setFont(font);
        dcost.setBounds(500, 240, 200, 30);
        frame.add(dcost);

        JTextArea ddiscription = new JTextArea("");
        ddiscription.setFont(font);
        ddiscription.setBounds(500, 300, 300, 130);
        frame.add(ddiscription);

        JTextField dstatus = new JTextField("");
        dstatus.setFont(font);
        dstatus.setBounds(500, 460, 200, 30);
        frame.add(dstatus);

        JButton done = new JButton("Commit");
        done.setFont(font);
        done.setBounds(240, 560, 130, 35);
        frame.add(done);
        done.setVisible(false);

        JButton skip = new JButton("Skip");
        skip.setFont(font);
        skip.setBounds(550, 560, 130, 35);
        frame.add(skip);
        skip.setVisible(false);

        JButton rejected = new JButton("Decline");
        rejected.setFont(font);
        rejected.setBounds(400, 560, 130, 35);
        frame.add(rejected);
        rejected.setVisible(false);

        JButton start = new JButton("Start");
        start.setFont(font);
        start.setBounds(400, 560, 130, 35);
        frame.add(start);
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start.setVisible(false);
                done.setVisible(true);
                skip.setVisible(true);
                rejected.setVisible(true);
            }
        });

        frame.add(title);
        frame.setSize(1080, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        try {
            String datauserid, dataproductname, datadiscription, datastatus, databrand, datatype, datapostid; Date datadate;
            int datacost;
            Connection con = AdminDatabase.getConnection();
            String sql = "select * from producttable where status='pending'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs1 = pst.executeQuery();
            int i, j = 0;
            while (rs1.next()) {
                count++;
            }
            String useridarr[] = new String[count];
            String productnamearr[] = new String[count];
            int costarr[] = new int[count];
            String brandarr[] = new String[count];
            String discriptionarr[] = new String[count];
            String statusarr[] = new String[count];
            String typearr[] = new String[count];
            String postidarr[] = new String[count];
            Date datearr[] = new Date[count];
            
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                //System.out.println(rs.getString("user_id"));
                datauserid = rs.getString("user_id");
                useridarr[j] = datauserid;
                dataproductname = rs.getString("p_name");
                productnamearr[j] = dataproductname;
                datacost = rs.getInt("cost");
                costarr[j] = datacost;
                databrand = rs.getString("brand");
                brandarr[j] = databrand;
                datadiscription = rs.getString("descrip");
                discriptionarr[j] = datadiscription;
                datastatus = rs.getString("status");
                statusarr[j] = datastatus;
                datatype = rs.getString("type");
                typearr[j] = datatype;
                datapostid = rs.getString("post_id");
                postidarr[j] = datapostid;
                datadate = rs.getDate("date");
                datearr[j] = datadate;
                j++;
            }
            //System.out.println(count +"  " + datearr[2]);

            start.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    duserid.setText(useridarr[index]);
                    dproductname.setText(productnamearr[index]);
                    String myString = Integer. toString(costarr[index]);
                    dcost.setText(myString);
                    ddiscription.setText(discriptionarr[index]);
                    dstatus.setText(statusarr[index]);
                    index++;

                }
            });

            done.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ChangedataToDisplaytable ob1 = new ChangedataToDisplaytable();
                    ob1.display(useridarr[index - 1], productnamearr[index - 1], costarr[index-1],brandarr[index-1], discriptionarr[index-1], "approved", typearr[index-1],postidarr[index-1]);
                    UpdateProducttable ob2 = new UpdateProducttable();
                    ob2.update(useridarr[index - 1], productnamearr[index - 1], costarr[index-1],brandarr[index-1], discriptionarr[index-1], "approved", typearr[index-1],postidarr[index-1]);
                    duserid.setText(useridarr[index]);
                    dproductname.setText(productnamearr[index]);
                    String myString = Integer. toString(costarr[index]);
                    dcost.setText(myString);
                    ddiscription.setText(discriptionarr[index]);
                    dstatus.setText(statusarr[index]);
                    index++;

                }
            });

            rejected.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DeclineProducttable ob3 = new DeclineProducttable();
                    ob3.decline(useridarr[index - 1], productnamearr[index - 1], costarr[index-1],brandarr[index-1], "Sorry! Your Product was not approved by admin . Pls contact Customercare", "declined", typearr[index-1],postidarr[index-1]);
                    duserid.setText(useridarr[index]);
                    dproductname.setText(productnamearr[index]);
                    String myString = Integer. toString(costarr[index]);
                    dcost.setText(myString);
                    ddiscription.setText(discriptionarr[index]);
                    dstatus.setText(statusarr[index]);
                    index++;
                }
            });

            skip.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(count==index)
                    {
                        frame.setVisible(false);
                        
                    }
                    else
                    {
                    duserid.setText(useridarr[index]);
                    dproductname.setText(productnamearr[index]);
                    String myString = Integer. toString(costarr[index]);
                    dcost.setText(myString);
                    ddiscription.setText(discriptionarr[index]);
                    dstatus.setText(statusarr[index]);
                    index++;
                    }
                }
            });

        } catch (SQLException a) {
            System.out.print(a);
            //JOptionPane.showMessageDialog(frame, "Error Occured While Connecting DataBase!!....");

        }

    }

}
