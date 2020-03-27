import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        String color;
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Enter side a: ");
                a = sc.nextDouble();
                System.out.print("Enter side b: ");
                b = sc.nextDouble();
                System.out.print("Enter side c: ");
                c = sc.nextDouble();
                if (a + b < c || b + c < a || c + a < b) {
                    System.out.println("Not triangle");
                }
            } while (a + b < c || b + c < a || c + a < b);

            System.out.print("Enter a color: ");
            color = sc.next();

            Triangle triangle = new Triangle(color, true, a, b, c);
            System.out.println(triangle.toString());

            Shape shape = new Shape();
            System.out.println(shape.toString());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
