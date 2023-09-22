package geekbrains_seminar_6.ocp;

public class SquareV2 implements ShapeV2{

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
    private final int side;

    public int getSide() {
        return side;
    }

    public SquareV2(int side) {
        this.side = side;
    }
}
