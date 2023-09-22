package geekbrains_seminar_6.ocp;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        // Вариант 1
//        List<Shape> shapes = new ArrayList<>();
//        shapes.add(new RightTriangle(2, 3));
//        shapes.add((new Square(4)));
//        shapes.add(new Circle(3));
//
//        double sumArea = 0;
//        for (Shape shape: shapes){
//            if(shape instanceof RightTriangle){
//                RightTriangle triangle = (RightTriangle) shape;
//                sumArea += triangle.getKatet1() * triangle.getKatet2() / 2;
//            }
//            if (shape instanceof Square){
//                Square square = (Square) shape;
//                sumArea += Math.pow((square.getSide()), 2);
//            }
//            if (shape instanceof Circle){
//                Circle circle = (Circle) shape;
//                sumArea += Math.PI * circle.getRadius() * circle.getRadius();
//            }
//        }
//        System.out.printf("Сумма площадей равна %.2f", sumArea);

        //Вариант 2

        List<ShapeV2> ShapeV2 = new ArrayList<>();
        ShapeV2.add(new RightTriangleV2(2, 3));
        ShapeV2.add((new SquareV2(4)));
        ShapeV2.add(new CircleV2(3));

        double sumArea = 0;
        for (ShapeV2 shapeV2: ShapeV2){
            sumArea += shapeV2.getArea();
        }
        System.out.printf("Сумма площадей равна %.2f", sumArea);









    }
}
