package com.alpha.work;

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
