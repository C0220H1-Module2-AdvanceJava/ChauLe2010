package resizeable.shape;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + getRadius()
                + " has Area = "
                + getArea()
                + " and Perimeter = "
                + getPerimeter()
                + " ,Which is a Subclass of "
                + super.toString();
}


    public void resize(double percent) {
        double newRadius = getRadius() * (percent/100 + 1);
        System.out.println("New radius of Circle = " + newRadius);
    }
}
