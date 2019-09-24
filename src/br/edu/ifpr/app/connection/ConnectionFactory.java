package br.edu.ifpr.app.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection(){

        Connection connection = null;
        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost/myagenda", "jefferson", "jefferson");

        } catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
        }

        return connection;

    }

}
