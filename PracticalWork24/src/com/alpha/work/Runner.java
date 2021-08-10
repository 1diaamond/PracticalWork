package com.alpha.work;

import java.util.Arrays;

public class Runner {
    public void run () {
        Shape[] shapes = {
                new Circle("green", 12.2),
                new Circle("green", 12.2),
                new Rectangle("black",1.3,1.7),
                new Rectangle("black",1.5,1.8),
                new Triangle("red", 15.6,12.0,10.1),
                new Triangle("red", 15.6,12.0,10.1)
        };

        shapePrinter(shapes);
        System.out.println("общая площадь всех фигур = "+shapeAreasSummer(shapes));
        String figure = "Circle";
        System.out.println("общая площадь фигур типа "+figure+" = "+shapeAreasSummer(shapes,figure));

        Rectangle rectangle1 = new Rectangle("black",1.3,1.7);
        Rectangle rectangle2 = new Rectangle("black",1.5,1.8);
        System.out.println("Результат сравнения 1 :" + rectangle1.compareTo(rectangle2));
        System.out.println("Результат сравнения 2 :" + rectangle2.compareTo(rectangle1));
        System.out.println("Результат сравнения 2 :" + rectangle1.compareTo(rectangle1));
        System.out.println("Список без сортировки");
        shapePrinter(shapes);
        System.out.println("Список с сортировкой");
        Arrays.sort(shapes);
        shapePrinter(shapes);
        System.out.println("Список с сортировкой по цвету");
        Arrays.sort(shapes, new MyComparatorColor());
        shapePrinter(shapes);



    }
    public void shapePrinter(Shape[] shapes){
        for (Shape shape: shapes) {
            shape.draw();
        }
    }

    public double shapeAreasSummer(Shape[] obj){
        double sumArea=0.0;
        for (Shape area: obj) {
            sumArea+= area.calcArea();
        }
        return sumArea;
    }

    public double shapeAreasSummer(Shape[] obj, String type){
        double sumArea = 0.0;
        for(Shape area: obj) {
            if(type.equals(area.getClass().getSimpleName())){
                sumArea += area.calcArea();
            }
        }
        return sumArea;
    }
}