/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;




import java.sql.Connection;
import java.sql.DriverManager;

public class AdminDatabase {

    private static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/electronicsdb", "root", "");
        } catch (Exception ex) {
            System.out.println("  " + ex);
        }
        return connection;
    }

}
