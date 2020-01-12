
package cceProject;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class connection {
    public static Connection connectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:Book1.db");
            System.out.println("Connected");
            return conn;
    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
             return null;
                    }
        }
}
