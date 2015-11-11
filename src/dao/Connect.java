/*
 * Copyright Yacine Mayou
 * Software created by Yacine Mayou
 */
package dao;

import compta.Main;
import java.io.FileInputStream;
import java.io.IOException;
import static java.lang.System.getProperty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Tfk
 */
public class Connect {
    private static String HOST;
    private static String NAME;
    private static String USER;
    private static String PWD;
    private static String PORT;
    
    private static final Connect conn = new Connect();
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    
    private Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
    
    private Connection createConnection() {
        Connection connection = null;
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("options.properties"));
            LOGGER.trace("reading options properties");
            HOST = props.getProperty("SERVER");
            NAME = props.getProperty("TABLENAME");
            USER = props.getProperty("USER");
            PWD = props.getProperty("PWD");
            PORT = props.getProperty("PORT");
        } catch (IOException io) {
            LOGGER.log(Level.INFO, "Options properties file doesn't exit\n" + io.getMessage() + "\n" + io.getLocalizedMessage());
        }
        
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
    
    /**
     * 
     * @param host Server host
     * @param port Server port
     * @param database Database name
     * @param user User name
     * @param password User password
     * @return true when connection is ok
     */
    public static boolean testConnection(String host, String port, String database, String user, String password)
    {
        try {
            return DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database, user, password) != null;
        } catch (SQLException ex) {
            LOGGER.log(Level.INFO, "Problem to connect to this database : " + host + " - " + port + " - " + database + " - " + user + " - " + password);
            return false;
        }
    }
}
