package test.game;

import shape.triangle.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape1 = new Shape("Blue",false);
        System.out.println(shape1);
    }
}
