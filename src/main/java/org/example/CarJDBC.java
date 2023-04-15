package org.example;

import java.sql.*;
import java.util.ArrayList;

public class CarJDBC {
    private static Connection connection =  DBConnection.getConnection();

    public static void addCar(Car car) throws SQLException {
        String sql = "insert into Car(name, model, makeC)"
                + "values (?,?,?)";
        PreparedStatement cr;
        try {
            cr = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        cr.setString(1, car.getName());
        cr.setInt(2, car.getModel());
        cr.setString(3, car.getMakeC());
        cr.executeUpdate();

    }
    public static void removePerson(Car car) throws SQLException {
        String sql = "delete from car where name = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, car.getName());
        ps.executeUpdate();

    }
    public static  Car getPerson(String name) throws SQLException {
        ArrayList<Car> array = getAllCar();
        for (Car car : array) {
            if (car.getName().equals(name)) {
                return car;
            }
        }
        return null;
    }

    public static ArrayList<Car> getAllCar() throws SQLException {
        ArrayList<Car> array = new ArrayList<Car>();

        ResultSet result = connection.prepareStatement("select * from car").executeQuery();
        while (result.next()) {
            Car car = new Car();
            car.setName(result.getString("name"));
            car.setModel(result.getInt("model"));
            car.setMakeC(result.getString("makec"));
            array.add(car);
        }
        result.close();
        return array;
    }

}
