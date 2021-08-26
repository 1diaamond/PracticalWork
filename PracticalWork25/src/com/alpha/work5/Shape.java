package com.alpha.work5;

public abstract class Shape implements Drawable, Comparable{
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calcArea ();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static Shape parseShape(String shape){
        String[] str = shape.split("\\W");
        switch (str[0]){
            case "Triangle" : return Triangle.parseTriangle(shape);
            case "Circle" : return Circle.parseCircle(shape);
            case "Rectangle" : return Rectangle.parseRectangle(shape);
        }
        return null;
    }

    public static void printShapes(Shape[] shapes){
        for (Shape shape: shapes) {
            if (shape != null) shape.draw();
        }
    }

    @Override
    public void draw() {
        System.out.println(this + ", area = "+ calcArea()) ;
    }

    @Override
    public String toString(){
        return "class=" + getClass().getSimpleName() +
                ": color=" +color + " ,";
    }

    @Override
    public int compareTo(Object o) {
        return ((Double)this.calcArea()).compareTo((Double)((Shape)o).calcArea());
    }
}
