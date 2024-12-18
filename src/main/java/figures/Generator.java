package figures;

import java.util.Random;

public class Generator {
    public Generator() {
}

    public static Circle generateCircle() {
        Random random = new Random();
        Circle circle = new Circle(random.nextInt(1, 1000));
        return circle;
    }
    public static Square generateSquare() {
        Random random = new Random();
        Square square = new Square(random.nextInt(1, 1000));
        return square;
    }
    public static Trangle generateTrangle() {
        Random random = new Random();
        Trangle trangle = new Trangle(random.nextInt(1, 1000), random.nextInt(1, 1000));
        return trangle;
    }
    public static double[] getArrayCircle() {
        double[] arrayCircle = new double[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            double radius = random.nextDouble(1,100);
            arrayCircle[i] = Math.PI*radius;
        }
        return arrayCircle;
    }
    public static int[] getArraySquare() {
        int[] arraySquare = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int side = random.nextInt(1, 100);
            arraySquare[i] = (int)Math.pow(side, 2);
        }
        return arraySquare;
    }
    public static int[] getArrayTrangle() {
        int[] arrayTrangle = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int width = random.nextInt(1,100);
            int heigth = random.nextInt(1,100);
            arrayTrangle[i] = (int)((width*heigth)/ 2.0);
        }
        return arrayTrangle;
    }
}
