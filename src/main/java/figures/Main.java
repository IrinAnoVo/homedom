package figures;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.findFigureArea();
        System.out.println("Площадь круга: " + circle.getArea());

        Square square = new Square(5);
        square.findFigureArea();
        System.out.println("Площадь квадрата: " + square.getArea());

        Trangle trangle = new Trangle(8, 6);
        trangle.findFigureArea();
        System.out.println("Площадь треугольника: " + trangle.getArea());

        System.out.println(Arrays.toString(Generator.getArrayCircle()));
        System.out.println(Arrays.toString(Generator.getArraySquare()));
        System.out.println(Arrays.toString(Generator.getArrayTrangle()));
    }
}
