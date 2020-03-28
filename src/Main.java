import geometric.*;
import geometric.circle.Circle;
import geometric.cylinder.Cylinder;
import geometric.rectangle.Rectangle;
import geometric.square.Square;
import geometric.triangle.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Geometric shape = null;
        int choice;
        boolean isExit = false;

        do {
            System.out.println("Calculate Area/Perimeter/Volume: ");
            System.out.println("1. Rectangle");
            System.out.println("2. Square");
            System.out.println("3. Triangle");
            System.out.println("4. Circle");
            System.out.println("5. Cylinder");
            System.out.println("0. Exit program");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            if (choice != 0
                    && choice != 1
                    && choice != 2
                    && choice != 3
                    && choice != 4
                    && choice != 5) {
                System.out.println("Invalid choice! Please choose again.");
                System.out.println();
            }
            switch (choice) {
                case 1:
                    shape = new Rectangle();
                    System.out.println("1. Calculate");
                    System.out.println("2. Test case");
                    System.out.println("Enter choice: ");
                    choice = scanner.nextInt();
                    break;
                case 2:
                    shape = new Square();
                    System.out.println("1. Calculate");
                    System.out.println("2. Test case");
                    System.out.println("Enter choice: ");
                    choice = scanner.nextInt();
                    break;
                case 3:
                    shape = new Triangle();
                    System.out.println("1. Calculate");
                    System.out.println("2. Test case");
                    System.out.println("Enter choice: ");
                    choice = scanner.nextInt();
                    break;
                case 4:
                    shape = new Circle();
                    System.out.println("1. Calculate");
                    System.out.println("2. Test case");
                    System.out.println("Enter choice: ");
                    choice = scanner.nextInt();
                    break;
                case 5:
                    shape = new Cylinder();
                    System.out.println("1. Calculate");
                    System.out.println("2. Test case");
                    System.out.println("Enter choice: ");
                    choice = scanner.nextInt();
                    break;
                case 0:
                    System.out.println("Exit Program!");
                    isExit = true;
            }
            if (shape != null) {
                switch (choice) {
                    case 1:
                        shape.inputData();
                        shape.displayData();
                        break;
                    case 2:
                        shape.testCase();
                        break;
                }
            }
        } while (!isExit);
    }
}
