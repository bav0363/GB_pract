package geekbrains_seminar_6.ocp;

public class CircleV2 implements ShapeV2{
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    private final int radius;

    public int getRadius() {
        return radius;
    }

    public CircleV2(int radius) {
        this.radius = radius;
    }
}
