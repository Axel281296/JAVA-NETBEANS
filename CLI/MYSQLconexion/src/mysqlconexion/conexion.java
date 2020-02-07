package mysqlconexion;

import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conexion {
    private Connection conn;
    private Statement  Statement;
    public Connection openConnection() throws SQLException 
    {
      
        if(conn==null){
            String url="jdbc:mysql://94.130.9.61/";
            String dbname="tsglobal_dayana";
            String driver="com.mysql.jdbc.Driver";
            String userName="tsglobal_axel";
            String password="Ecua.2019#";
            
        try{
            
            Class.forName(driver);
            this.conn=(Connection)DriverManager.getConnection(url+dbname,userName,password);
             JOptionPane.showMessageDialog(null, "CONEXION COMPLETADA");
            
        }
        catch(ClassNotFoundException | SQLException sqle){
             JOptionPane.showMessageDialog(null, "FALLO DE CONEXION");
            
        }
        }
        return conn;
          }
}
