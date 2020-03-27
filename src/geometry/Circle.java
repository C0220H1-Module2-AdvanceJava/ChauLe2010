package geometry;

import java.util.Scanner;

public class Circle extends Geometry {
    private double radius = 1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * this.radius);
    }

    @Override
    public double getArea() {
        return (Math.PI * this.radius * this.radius);
    }

    @Override
    public String toString() {
        return "a circle: radius = " + this.radius
                + " ; color = " + super.getColor()
                + " ; filled = " + super.isFilled()
                + "; perimeter = " + this.getPerimeter()
                + " ; area = " + this.getArea();
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius = ");
        this.radius = scanner.nextDouble();
        System.out.println("Enter color = ");
        scanner.nextLine();
        this.setColor(scanner.nextLine());
        System.out.println("is fill ?  = ");
        this.setFilled(scanner.nextBoolean());
    }

    @Override
    public void resize(double percent) {
        this.radius += (this.radius * percent) / 100;

    }

    public int compareTo(Circle circle) {
        if (this.getRadius() > circle.getRadius()) {
            return 1;
        } else if (this.getRadius() < circle.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}
