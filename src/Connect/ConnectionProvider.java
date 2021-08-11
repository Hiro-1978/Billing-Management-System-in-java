
package Connect;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/billing?useUnicode=true&characterEncoding=UTF-8","root","root");
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Database Connect Error!!");
            return null;
        }
    }
   
}
