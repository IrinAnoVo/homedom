package figures;

public class Figure {
    private static double area;
    private int width;

    public Figure(int width) {
        this.width = width;
    }
    private double findFigureArea(Figure figure) {
        double area = 0;
        return area;
    }
    public Figure(double area) {
        this.area = area;
    }
    public Figure(double area, int side2, int side3, int height) {
        this.area = area;
    }
    public static double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void getArea(double area) {
        this.area = area;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void findFigureArea() {
    }
}
