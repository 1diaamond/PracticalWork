package com.alpha.work5;

public class Triangle extends Shape{
        private double a;
        private double b;
        private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triangle parseTriangle (String shape){
        String[] str = shape.split("\\W");
        switch (str[0]){
            case "Triangle" : return new Triangle(str[1],Double.parseDouble(str[2]),Double.parseDouble(str[3]),Double.parseDouble(str[4]) );
        }
        return null;
    }

    @Override
    public String toString() {
        return super.toString() +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
     @Override
    public double calcArea(){
        double p = (a+b+c)/2;
        return (double)(int)((Math.sqrt(p*(p-a)*(p-b)*(p-c)))*100)/100;
    }
}
