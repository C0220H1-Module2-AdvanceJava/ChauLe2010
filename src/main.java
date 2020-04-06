import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh thứ nhất:");
        double side1 = sc.nextDouble();
        System.out.println("Nhập độ dài cạnh thứ hai:");
        double side2 = sc.nextDouble();
        System.out.println("Nhập độ dài cạnh thứ ba:");
        double side3 = sc.nextDouble();
        while (!isTriangle(side1, side2, side3)){
            System.out.println("3 cạnh này không tạo thành tam giác. Mời nhập lại:");
            System.out.println("Nhập độ dài cạnh thứ nhất:");
            side1 = sc.nextDouble();
            System.out.println("Nhập độ dài cạnh thứ hai:");
            side2 = sc.nextDouble();
            System.out.println("Nhập độ dài cạnh thứ ba:");
            side3 = sc.nextDouble();
        }
        Triangle triangle = new Triangle(side1, side2, side3, "xanh", true);
        System.out.println(triangle);
        System.out.println("Diện tích là: " + triangle.getArea());
        System.out.println("Chu vi là: " + triangle.getPerimeter());
    }

    public static boolean isTriangle(double side1, double side2, double side3){
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }
}
