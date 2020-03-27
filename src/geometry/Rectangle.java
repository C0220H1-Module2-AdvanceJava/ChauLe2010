package geometry;

import java.util.Scanner;

public class Rectangle extends Geometry {
    private double length = 1;
    private double width = 1;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return ((this.length + this.width) * 2);
    }

    @Override
    public double getArea() {
        return (this.length * this.width);
    }

    @Override
    public String toString() {
        return "a rectangle with length = " + this.length
                + " ; width = " + this.width
                + " ; color = " + super.getColor()
                + " ; filled = " + super.isFilled()
                + "; perimeter = " + this.getPerimeter()
                + " ; area = " + this.getArea();
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length = ");
        this.length = scanner.nextDouble();
        System.out.println("Enter width = ");
        scanner.nextLine();
        this.width = scanner.nextDouble();
        System.out.println("Enter color  = ");
        scanner.nextLine();
        this.setColor(scanner.nextLine());
        System.out.println("is fill ?  = ");
        this.setFilled(scanner.nextBoolean());
    }

    @Override
    public void resize(double percent) {
        this.width += (this.width * Math.sqrt(percent)) / 100;
        this.length += (this.length * Math.sqrt(percent)) / 100;
    }

    public int compareTo(Rectangle rectangle) {
        if (this.getArea() > rectangle.getArea()) {
            return 1;
        } else if (this.getArea() < rectangle.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
