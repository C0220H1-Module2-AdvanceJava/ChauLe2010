import java.util.Scanner;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1){
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    private double getPerimeter() {
        return (this.side1 + this.side2 + this.side3);
    }

    private double getHalfOfPerimeter() {
        return (getPerimeter() / 2);
    }

    public double getArea() {
        double subtraction1 = getHalfOfPerimeter() - this.side1;
        double subtraction2 = getHalfOfPerimeter() - this.side2;
        double subtraction3 = getHalfOfPerimeter() - this.side3;
        return Math.pow(getHalfOfPerimeter() * subtraction1 * subtraction2 * subtraction3, 0.5);
    }

    public void checkTriangleSide(double side) {
        if (side <= 0) {
            System.out.println("Input invalid, please input number > 0.");
        }
    }

    Scanner input = new Scanner(System.in);
    public void inputSide1() {
        do {
            System.out.print("Input length of Side 1 : ");
            setSide1(input.nextDouble());
            checkTriangleSide(this.side1);
        } while (this.side1 <= 0);
    }

    public void inputSide2() {
        do {
            System.out.print("Input length of Side 2 : ");
            setSide2(input.nextDouble());
            checkTriangleSide(this.side2);
        } while (this.side2 <= 0);
    }

    public void inputSide3() {
        do {
            System.out.print("Input length of Side 3 : ");
            setSide3(input.nextDouble());
            checkTriangleSide(this.side3);
        } while (this.side3 <= 0);
    }

    public boolean isTriangle() {
        return (this.side1 + this.side2 > this.side3
                && this.side1 + this.side3 > this.side2
                && this.side2 + this.side3 > this.side1);
    }

    public void checkTriangle (){
        while (!isTriangle()){
            System.out.println("Inputted above 3 numbers can not make a triangle. Please input again");
            inputSide1();
            inputSide2();
            inputSide3();
            isTriangle();
        }
    }

    @Override
    public String toString() {
        return "Triangle : "
                + "side 1: " + side1 + ","
                + "side 2: " + side2 + ","
                + "side 3: " + side3;
    }

    public void displayTriangle() {
        System.out.println(this.toString());
    }

    public void displayColor() {
        System.out.println("Color of triangle is '" + this.getColor()
                + (this.getFilled() ? "' and filled" : "' and not filled"));
    }
}