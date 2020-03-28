import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Geometric shape = new Geometric();
        int choice;
        boolean isExit = false;

        do {
            System.out.println("Calculate Area/Perimeter/Volume: ");
            System.out.println("1. Rectangle");
            System.out.println("2. Square");
            System.out.println("3. Triangle");
            System.out.println("4. Circle");
            System.out.println("5. Cylinder");
            System.out.println("6. Test Case");
            System.out.println("0. Exit program");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            if (choice != 0
                    && choice != 1
                    && choice != 2
                    && choice != 3
                    && choice != 4
                    && choice != 5
                    && choice != 6) {
                System.out.println("Invalid choice! Please choose again.");
                System.out.println();
            } else if (choice != 0) {

                switch (choice) {
                    case 1:
                        shape = new Rectangle();
                        break;
                    case 2:
                        shape = new Square();
                        break;
                    case 3:
                        shape = new Triangle();
                        break;
                    case 4:
                        shape = new Circle();
                        break;
                    case 5:
                        shape = new Cylinder();
                        break;
                    case 6:
                        shape.testCase();
                        break;
                }
                shape.inputData();
                shape.displayData();
            } else {
                System.out.println("Exit program!");
                isExit = true;
            }
        } while (!isExit);
    }
}
