package by.itClass;

import by.itClass.interfaces.Actions;

public class Rectangle implements Actions {

    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getSquare() {
        return height*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(height+width);
    }
}
