package com.alpha.work5;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public static Circle parseCircle(String shape){
        String[] str = shape.split("\\W");
        switch (str[0]){
            case "Circle" : return new Circle(str[1],Double.parseDouble(str[2]));
        }
        return null;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI*(Math.pow(radius,2));
    }

    @Override
    public String toString() {
        return super.toString() +
                "radius=" + radius +
                '}';
    }
}
