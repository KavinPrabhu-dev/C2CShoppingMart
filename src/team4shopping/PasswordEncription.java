
package team4shopping;



import java.util.*;
   public class PasswordEncription {
       
       public static String encript(String passcode){
           long teampasscode = 1;
           int length = passcode.length(),i,j;
           char a;
           for(i=0;i<length;i++){
               a=passcode.charAt(i);
               j=(int) a;
               teampasscode = teampasscode*4;
           } 
           String teamfourpasscode = Long.toString(teampasscode);
           return teamfourpasscode;
       }
       
   public static void main(String args[]){
       String a =encript("Q123456789k@rtg");
       System.out.println(a);
       String a1 =encript("kavinprabhu");
       System.out.println(a1);
   }


}


