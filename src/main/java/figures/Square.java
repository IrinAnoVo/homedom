package figures;

public class Square extends Figure{
    private int width;

    public Square(int width) {
        super(width);
    }
    @Override
    public void findFigureArea() {
        this.setArea(super.getWidth() * super.getWidth());
    }
}
