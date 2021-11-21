package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(12.5F,11);
        Rectangle rectangle2 = new Rectangle(5,25.7F);
        Rectangle rectangle3 = new Rectangle(13.3F,14);
        Square square1 = new Square(10);
        Square square2 = new Square(20);
        Triangle triangle1 = new Triangle(7, 3 ,5);
        Triangle triangle2 = new Triangle(10,12,15);
        Triangle triangle3 = new Triangle(19,17,22);
        Map<Figure , String> f = new HashMap<Figure , String>();
        f.put(rectangle1 , "Rectangle 1");
        f.put(rectangle2, "Rectangle 2");
        f.put(rectangle3, "Rectangle 3");
        f.put(square1, "Square 1");
        f.put(square2, "Square 2");
        f.put(triangle1, "Triangle 1");
        f.put(triangle2, "Triangle 2");
        f.put(triangle3, "Triangle 3");
        Figure circle = new Figure (){
            double radius=12 ;
            @Override
            public double getArea() {
                double area;
                area=3.14*radius*radius;
                return area;
            }

            @Override
            public double getPerimeter() {
                double perimeter;
                perimeter=2*3.14*radius;
                return perimeter;
            }
        };
        f.put(circle," Circle ");
        System.out.println("biggest area "+FigureController.giveBiggestArea(f));
        System.out.println("biggest Perimeter "+FigureController.giveBiggestPerimeter(f));
    }
}
