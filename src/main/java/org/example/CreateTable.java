package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {
    private static Connection connection = DBConnection.getConnection();
    private static PreparedStatement statement = null;
    public static void createTable(){
        try {
            String query = "CREATE TABLE car(NAME VARCHAR(255),MODEL int ,"+
                    " MAKEC VARCHAR(10))";
            statement = connection.prepareStatement(query);
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
