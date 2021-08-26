package com.alpha.work5;

public class Rectangle extends Shape{
    private double width ;
    private double height ;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public static Rectangle parseRectangle(String shape){
        String[] str = shape.split("\\W");
        switch (str[0]){
            case "Rectangle" : return new Rectangle(str[1],Double.parseDouble(str[2]),Double.parseDouble(str[3]) );
        }
        return null;
    }

    @Override
    public String toString() {
        return super.toString() +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double calcArea() {
        return width*height;
    }
}
