package employeeManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
   static Connection con;
    public static Connection createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost/company";
            String user="root";
            String password="Vinay@123";
            con= DriverManager.getConnection(url,user,password);

        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }
        return con;
    }
}
