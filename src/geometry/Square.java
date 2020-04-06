package geometry;

import java.util.Scanner;

public class Square extends Rectangle implements Colorable {
    private double side = 1;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "a square with side = " + this.side
                + " ; color = " + super.getColor()
                + " ; filled = " + super.isFilled()
                + "; perimeter = " + this.getPerimeter()
                + " ; area = " + this.getArea();
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side = ");
        this.side = scanner.nextDouble();
        System.out.println("Enter color  = ");
        scanner.nextLine();
        this.setColor(scanner.nextLine());
        System.out.println("is fill ?  = ");
        this.setFilled(scanner.nextBoolean());
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public void resize(double percent) {
        this.side += (this.side * Math.sqrt(percent)) / 100;
    }
}
