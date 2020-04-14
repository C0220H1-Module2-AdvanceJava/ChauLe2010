package test.game;

import shape.triangle.Shape;
import shape.triangle.Triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of 3 sides of Triangle: ");
        System.out.print("Side 1 = ");
        double side1 = scanner.nextDouble();
        System.out.print("Side 2 = ");
        double side2 = scanner.nextDouble();
        System.out.print("Side 3 = ");
        double side3 = scanner.nextDouble();

        while (!Triangle.isTriangle(side1, side2, side3)) {
            System.out.println("The length of 3 sides you Enter is not valid! Please enter again:");
            System.out.print("Side 1 = ");
            side1 = scanner.nextDouble();
            System.out.print("Side 2 = ");
            side2 = scanner.nextDouble();
            System.out.print("Side 3 = ");
            side3 = scanner.nextDouble();
        }
        Shape triangle1 = new Triangle(side1, side2, side3);
        Shape triangle2 = new Triangle("Orange",false, side1, side2, side3);

        System.out.println(triangle1);
        System.out.println(triangle2);
    }
}
