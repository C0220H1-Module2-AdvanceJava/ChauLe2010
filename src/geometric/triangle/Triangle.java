package geometric.triangle;

import geometric.Geometric;

public class Triangle extends Geometric {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super.setColor(color);
        super.setFilled(filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public boolean getFilled() {
        return super.getFilled();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter
                * (halfPerimeter - side1)
                * (halfPerimeter - side2)
                * (halfPerimeter - side3));
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public String toString() {
        return "A geometric.triangle.Triangle with side1 = "
                + side1
                + ", side2 = "
                + side2
                + " , side3 = "
                + side3
                + ", which is a subclass of "
                + super.toString()
                + "\n"
                + "Perimeter = "
                + super.decimalFormat.format(getPerimeter())
                + " - Area = "
                + super.decimalFormat.format(getArea());
    }

    @Override
    public void inputData() {
        System.out.print("Enter side 1: ");
        setSide1(super.scanner.nextDouble());
        System.out.print("Enter side 2: ");
        setSide2(super.scanner.nextDouble());
        System.out.print("Enter side 3: ");
        setSide3(super.scanner.nextDouble());
    }

    @Override
    public void displayData() {
        System.out.printf("Perimeter: %.2f - Area: %.2f \n \n", getPerimeter(), getArea());
    }

    @Override
    public void testCase() {
        //Test class geometric.triangle.Triangle
        Geometric triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);
        triangle = new Triangle("pink", false, 3, 4, 5);
        System.out.println(triangle);
        System.out.println();
    }
}
