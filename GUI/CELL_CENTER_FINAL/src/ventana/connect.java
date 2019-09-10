package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

public final class SQL {
    private Connection MySQLConnection;
    private Statement MySQLStatement;
    public ResultSet rs = null;
    public String errorString = null;
    public String lastString = null;
    @SuppressWarnings("unused")
    private Driver MySQLDriver;
    private String MySQLURL;
    public boolean online = false;

    public SQL(String host, String port, String user, String pass, String db) {
        try {
            MySQLURL = "jdbc:mysql://" + host + ":" + port + "/";
            Class.forName("com.mysql.jdbc.Driver");
            MySQLConnection = DriverManager.getConnection(MySQLURL, user, pass);
            MySQLStatement = MySQLConnection.createStatement();
            MySQLConnection.setAutoCommit(true);
            tryUpdate("CREATE DATABASE IF NOT EXISTS `"+db+"`");
            tryUpdate("USE `"+db+"`");
            online = true;
        } catch (Exception e) {
            errorString = e.toString();
            close();
        }
    }
    
    public boolean close() {
        if (! online) return true;
        try {
            getConnection().close();
            online = false;
            return true;
        } catch (SQLException e) {
            errorString = e.toString();
            return false;
        }
    }
    
    public Connection getConnection() {
        return MySQLConnection;
    }

    public Statement getStatement() {
        return MySQLStatement;
    }

    public static String typeToStr(String name) {
        //String
        if ("String".equals(name)) return "VARCHAR";
        //Int
        if ("long".equals(name)) return "BIGINT";
        if ("int".equals(name)) return "INT";
        if ("short".equals(name)) return "SMALLINT";
        if ("byte".equals(name)) return "TINYINT";
        //Doubles
        if ("double".equals(name)) return "DOUBLE";
        if ("float".equals(name)) return "FLOAT";
        //Misc
        if ("boolean".equals(name)) return "BOOLEAN";
        //Error
        return "error";
    }
        
    public boolean tryUpdate(String sqlString) {
        lastString = sqlString;
        try {
            getStatement().executeUpdate(sqlString);
            return true;
        } catch (Exception ex) {
            errorString = ex.toString();
            return false;
        }
    }
    
    public boolean trySelect(String sqlString) {
        lastString = sqlString;
        try {
            //rs.
            rs = getStatement().executeQuery(sqlString);
            return true;
        } catch (Exception ex) {
            rs = null;
            errorString = ex.toString();
            return false;
        }
    }
    
    public boolean next() {
        try {
            return rs.next();
        } catch (SQLException e) {
            errorString = e.toString();
            return false;
        }
    }
    
     boolean createTable(String table, String fields) {
        return tryUpdate("CREATE TABLE IF NOT EXISTS `"+table+"` ("+fields+")");
    }
    
     boolean deleteTable(String table) {
        return tryUpdate("DELETE TABLE `"+table+"`");
    }

    //Count: Total
    public int count(String table) {
        trySelect("SELECT Count(*) FROM `"+table+"`");
        try {
            rs.first();
            return rs.getInt(1);
        } catch (SQLException ex) {
            errorString = ex.toString();
            return -1;
        }
    }
    //Count: By Column
    public int count(String table, String column, String value) {
        trySelect("SELECT Count(*) FROM `"+table+"` WHERE `"+column+"`='"+value+"'");
        try {
            rs.first();
            return rs.getInt(1);
        } catch (SQLException ex) {
            errorString = ex.toString();
            return -1;
        }
    }
    
    //Select by Column=value
    public boolean select(String table, String column, String value) {
        return trySelect("SELECT * FROM `"+table+"` WHERE `"+column+"`='"+value+"'");
    }
    
    public boolean update(String table, String column, String value, String values) {
        return tryUpdate("UPDATE `"+table+"` SET "+values+" WHERE `"+column+"`='"+value+"'");
    }
    
    public boolean insert(String table, String values) {
        return tryUpdate("INSERT INTO `"+table+"` VALUES ("+values+")");
    }

    
}