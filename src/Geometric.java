import java.text.DecimalFormat;
import java.util.Scanner;

public class Geometric {
    private String color;
    private boolean filled;
    private double area;
    private double perimeter;
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    Scanner scanner = new Scanner(System.in);

    public Geometric() {
        color = "green";
        filled = true;
    }

    public Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public boolean getFilled() {
        return filled;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with color of "
                + color
                + " and "
                + (filled ? "filled" : "not filled");
    }

    public void inputData() {
        System.out.println("Please enter all data: ");
    }

    public void displayData() {
        System.out.println();
        System.out.println("Here is the result: ");
    }

    public void testCase() {
        //Test class Geometric
        Geometric shape = new Geometric();
        System.out.println(shape);
        shape = new Geometric("red", false);
        System.out.println(shape);
        System.out.println();

        //Test class Circle
        Geometric circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("indigo", false, 10);
        System.out.println(circle);
        System.out.println();

        //Test class Rectangle
        Geometric rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle("orange", true, 2.3, 5.8);
        System.out.println(rectangle);
        System.out.println();

        //Test class Square
        Geometric square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square("yellow", true, 5.8);
        System.out.println(square);
        System.out.println();

        //Test class Cylinder
        Geometric cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(8);
        System.out.println(cylinder);
        cylinder = new Cylinder(3.6, 10);
        System.out.println(cylinder);
        cylinder = new Cylinder("black", true, 2.1, 20);
        System.out.println(cylinder);
        System.out.println();

        //Test class Triangle
        Geometric triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);
        triangle = new Triangle("pink", false, 3, 4, 5);
        System.out.println(triangle);
        System.out.println();
    }
}
