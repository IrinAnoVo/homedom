package figures;

public class Circle extends Figure{
    private int radius;

    public Circle(int width) {
        super(width);
        radius = width/2;
    }

    @Override
    public void findFigureArea() {
        this.setArea(Math.PI * radius * radius);
    }
}
