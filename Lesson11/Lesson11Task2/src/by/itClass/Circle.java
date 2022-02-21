package by.itClass;

import by.itClass.interfaces.Actions;

public class Circle implements Actions {
    private static double PI = 3.14;
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return PI*(radius*radius);
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }
}
