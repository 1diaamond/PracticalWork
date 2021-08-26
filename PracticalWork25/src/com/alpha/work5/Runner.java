package com.alpha.work5;

import static com.alpha.work5.Shape.printShapes;

public class Runner {
    public void run() {
        System.out.println(Shape.parseShape("Rectangle:RED:10,20"));
        System.out.println(Shape.parseShape("Circle:BLACK:10"));
        System.out.println(Shape.parseShape("Triangle:GREEN:9,7,12"));
        System.out.println(Shape.parseShape("Triangleq:GREEN:9,7,12"));

        Shape[] shapes = {
                Shape.parseShape("Triangleq:GREEN:9,7,12"),
                Shape.parseShape("Triangle:GREEN:9,7,12"),
                Shape.parseShape("Circle:BLACK:10"),
                Shape.parseShape("Rectangle:RED:10,20")};

        printShapes(shapes);
    }
}
