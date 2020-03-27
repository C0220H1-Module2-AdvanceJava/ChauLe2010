import java.util.Scanner;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(){

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1,double side2, double side3){
        super(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void inputSide(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of 3 sides: ");
        System.out.println("Side 1: ");
        this.side1 = scanner.nextDouble();
        System.out.println("Side 2: ");
        this.side2 = scanner.nextDouble();
        System.out.println("Side 3: ");
        this.side3 = scanner.nextDouble();
    }

    public double getArea(){
        double halfPeri = this.getPerimeter() / 2;
        return Math.sqrt(halfPeri*(halfPeri - this.side1)  * (halfPeri - this.side2) * (halfPeri - this.side3));
    }

    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color= " + this.getColor() +
                " " + (this.isFilled()? "filled" : "unfilled") +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
