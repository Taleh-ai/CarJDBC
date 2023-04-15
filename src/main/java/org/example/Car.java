package org.example;

public class Car {
    private String name;
    private int model;
    private String makeC;

    public Car(String name, int model, String makeC) {
        this.name = name;
        this.model = model;
        this.makeC = makeC;
    }

    public Car() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getMakeC() {
        return makeC;
    }

    public void setMakeC(String makeC) {
        this.makeC = makeC;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", makeC='" + makeC + '\'' +
                '}';
    }
}
