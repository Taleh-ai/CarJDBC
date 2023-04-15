package org.example;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        //CreateTable.createTable();
       //CarJDBC.addCar(new Car("BMW",2020,"DU"));
        //CarJDBC.removePerson(new Car("Volvo",2021,"Eu"));
        for (Car car : CarJDBC.getAllCar()) {
            System.out.println(car.toString());
        }
    }
}