
package ventana;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    private static String bd="cell_center";
    private static String USER = "root";
    private static String PASSWORD = "";
    private static String url = "jdbc:mysql://localhost/"+bd;
    private static Connection con;

    public static Connection connect (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,USER,PASSWORD);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error" +e.getMessage());
        }
        return con;
    }

}