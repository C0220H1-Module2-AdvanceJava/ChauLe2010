import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        inputData(triangle1);
        System.out.println(triangle1);

    }

    public static void inputData(Triangle triangle) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1: ");
        triangle.setSide1(sc.nextDouble());
        System.out.println("Enter the side 2: ");
        triangle.setSide2(sc.nextDouble());
        System.out.println("Enter the side 3: ");
        triangle.setSide3(sc.nextDouble());
//        sc.nextLine();
        System.out.println("Enter the color: ");
        triangle.setColor(sc.next());
    }
}
