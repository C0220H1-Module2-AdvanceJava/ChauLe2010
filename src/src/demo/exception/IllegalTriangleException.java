package demo.exception;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(double side1, double side2, double side3) {
        super();
    }

    public IllegalTriangleException(double value) {
        super("Illegal Triangle: " + value);
    }
}
