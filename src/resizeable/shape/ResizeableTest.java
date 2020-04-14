package resizeable.shape;

public class ResizeableTest {
    public static void main(String[] args) {
        double percent = Math.random() * 100;
        System.out.println("Each shape increase " + percent);

        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(17.6);
        resizeables[1] = new Rectangle(14.1, 17.6);
        resizeables[2] = new Square(17.6);

        System.out.println("After-resized:");
        for (Resizeable resizeable : resizeables) {
            resizeable.resize(percent);
        }
        Shape[] shapes = new Shape[3];
        shapes[0] = (Circle) resizeables[0];
        shapes[1] = (Rectangle) resizeables[1];
        shapes[2] = (Square) resizeables[2];

        System.out.println("Pre-resized:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }


    }
}

