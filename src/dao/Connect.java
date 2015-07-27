package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Tfk
 */
public class Connect {
    private static final String HOST = "localhost";
    private static final String NAME = "compta_test";
    private static final String USER = "root";
    private static final String PWD = "";
    private static final String PORT = "3306";
    
    private static final Connect conn = new Connect();
    
    private Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
    
    private Connection createConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + HOST + ":" + PORT + "/" + NAME, USER, PWD);
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return connection;
    }
    
    public static Connection getConnection() {
        return conn.createConnection();
    }
}
