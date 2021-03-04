/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team4shopping;

import java.awt.event.*;
import java.util.*;
import java.util.regex.*;
import javax.swing.*;
import team4shopping.User_register;
import team4shopping.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 class User_Password_Validation 
 {
     public boolean passwordvalid(String password){
            boolean isValid = true;
            String specialChars = "(.*[@,#,$,%].*)";
            String upperCaseChars = "(.*[A-Z].*)";
            String lowerCaseChars = "(.*[a-z].*)";
            String numbers = "(.*[0-9].*)";
            
            if (password.length() > 15 || password.length() < 8)
            {
                    new OptionPane("Password Should be Greater than 8 digit and less than 20");
                    isValid = false;
                    
            }
            
            else if (!password.matches(upperCaseChars ))
            {
                    
                    new OptionPane("Password must have atleast one uppercase character");
                    isValid = false;
            }
            
            else if (!password.matches(lowerCaseChars ))
            {
                    new OptionPane("Password must have atleast one lowercase character");
                    isValid = false;
            }
            
            else if (!password.matches(numbers ))
            {
                    new OptionPane("Password must have atleast one number");
                    isValid = false;
            }
            else if(!password.matches(specialChars ))
            {
                    new OptionPane("Password must have atleast one special character among @#$%");
                    isValid = false;
            }
            else{
                    }
            return isValid; 
    }

            
}
class OptionPane {  
JFrame frame;  
OptionPane(String str){  
    frame=new JFrame("Password Validation");  
    JOptionPane.showMessageDialog(frame,str,"Please Check",JOptionPane.WARNING_MESSAGE);     
}
}


    

