package figures;

public class Trangle extends Figure{
    private int side1;
    private int side2;
    private int side3;
    private int height;

    public Trangle(int width, int height) {
        super(width);
        this.height = height;
    }

    @Override
    public void findFigureArea() {
        int p = (super.getWidth() + side2 + side3) / 2;
        this.setArea(Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));
    }
}
