package com.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Ajinkya
 * Singeleton design pattern implementation 
 * Creates a single object of the connection
 *
 */
public class ConnectionSingleton {

    private static final ConnectionSingleton CONNECTION_SINGLETON = new ConnectionSingleton();
    private static Connection connection;

    /**
     * @return the connection
     */
    private static Connection getConnection() {
        return connection;
    }

    /**
     * @param connection
     *            the connection to set
     */
    public void setConnection(Connection connection) {
        ConnectionSingleton.connection = connection;
    }

    /**
     * private constructor
     * creates the connection object 
     * called only once
     */
    private ConnectionSingleton() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            setConnection(DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "root"));
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     * @return the connection object
     */
    public static Connection getConnectionObject() {
        return getConnection();
    }
}