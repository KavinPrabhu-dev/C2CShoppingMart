
package team4shopping;


//line 70 execute the next java code
// uid - Userid  (it have the userid String value)
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import customer.*;


public class User_login {
    public static String Uuserid="";
   //public static void main(String[] args) {
       public static void login(){
         String  strr = "C:\\Users\\USER\\Documents\\NetBeansProjects\\integration\\src\\images\\";
        JFrame frame = new JFrame("User Login");
        int x,y;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        x  = (int) ((screenSize.getWidth() - frame.getWidth()) / 2);
        y = (int) ((screenSize.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x-200, y-350);
        Icon icon1 = new ImageIcon(strr+"icons8-user-100.png");
        Icon image2 = new ImageIcon(strr+"login.png");
        Icon image3 = new ImageIcon(strr+"register.png");
        Icon icon4 = new ImageIcon(strr+"admin.png");
        JButton reset = new JButton(icon1);

        Font f=new Font("SansSerif",Font.ROMAN_BASELINE,17);
        Font f1=new Font("SansSerif",Font.ROMAN_BASELINE,20);
        Font tit=new Font("Calibri",Font.PLAIN,35);
        
        JLabel title = new JLabel("                    Surety 4 Shopping");title.setFont(tit);
        title.setForeground(Color.white);
        title.setOpaque(true);
        title.setBackground(new Color(0, 84, 220));
        JLabel l1= new JLabel("User ID");l1.setFont(f);
        JLabel l2 = new JLabel("Password");l2.setFont(f);
        JLabel l3 = new JLabel("Login");l3.setFont(f);
        JLabel l4 = new JLabel("Register");l4.setFont(f);
        JLabel l5 = new JLabel("Admin");l5.setFont(f);
        
        JTextField t1 = new JTextField("");t1.setFont(f1);
        JPasswordField t2 = new JPasswordField("");t2.setFont(f1);
        reset.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           String a =null;
           t1.setText(a);
           t2.setText(a);

                }
            });

        JButton button1 = new JButton(image2);
        button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                 //establish connection with database
                 String Userid=t1.getText(),Passcode=t2.getText();
                 Passcode = PasswordEncription.encript(Passcode);
                 Connection con = Database.getConnection();
                     String sql="select * from user_register_form where userid='"+Userid+"'";
                     PreparedStatement pst = con.prepareStatement(sql);
                     ResultSet rs=pst.executeQuery();
                     while(rs.next()){
                         String user = rs.getString("userid");
                         String p1=rs.getString("password");
                         //System.out.println(user + "  "+ p1+Userid);
                         if(Userid.equals(user)){
                             if(Passcode.equals(p1)){
                                 new OptionPane("Verified");
                                 Uuserid=Userid;
                                 MainPage1.main(null);
                                 //uid = t1.getText();
                                 //System.out.println(Userid);
                                 frame.setVisible(false);
                                 
                                 break;
                             }else{
                             new OptionPane("Userid and Password not matched");
                             break;
                             }
                         }else{
                         new OptionPane(" User-id does not exist");
                         break;
                         }
                     }
                     con.close();
            }catch(Exception a){
                new OptionPane(" User-id does not exist");
            }
        }
        });
        
        JButton button2 = new JButton(image3);
        button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.setVisible(false);
            User_register register = new User_register();
            register.register();
                }
            });
        
        JButton button3 = new JButton(icon4);
        button3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.setVisible(false);
            Admin_login ad_log = new Admin_login();
            ad_log.login();
                }
            });
        title.setBounds(0,0,800,80);
        reset.setBounds(220,90,100,100);
        l1.setBounds(80, 250, 100, 30);
        l2.setBounds(80, 290, 100, 30);
        t1.setBounds(290,250,200,30);
        t2.setBounds(290,290,200,30);
        button1.setBounds(100,350,60,60);
        button2.setBounds(250,350,60,60);
        button3.setBounds(410,350,60,60);
        l3.setBounds(110, 420, 100, 30);
        l4.setBounds(250, 420, 100, 30);
        l5.setBounds(420, 420, 100, 30);
        frame.add(title);
        frame.add(reset);
        frame.add(l1);
        frame.add(l2);
        frame.add(t1);
        frame.add(t2);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.setSize(600, 600);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  
        frame.setVisible(true);

    }
    
}

class Messages{
  class OptionPane {
      JFrame frame1;  
      OptionPane(String str){  
      frame1=new JFrame("Login Form");  
      JOptionPane.showMessageDialog(frame1,str,"Please Check",JOptionPane.WARNING_MESSAGE);     
}
} 

}
 
                                           
