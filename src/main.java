public class main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("Yellow", true);
        System.out.println(shape);

        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle("Orange", true, 3, 7,8);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());

        triangle.inputSide();
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
    }
}
