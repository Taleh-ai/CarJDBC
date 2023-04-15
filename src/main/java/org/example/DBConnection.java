package org.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static java.sql.Connection getConnection()  {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            java.sql.Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");
            System.out.println("Connected to the PostgreSQL database successfully.");
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void closeConnection(java.sql.Connection connection){
        try {
            connection.close();
            System.out.println("Connection is closed.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
