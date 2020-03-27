public class Circle extends Shape {
    private double radius = 1;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
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
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return this.radius * Math.PI * 2;
    }

    @Override
    public String toString() {
        return "A Circle width radius = " + getRadius() +
                "\narea = " + getArea() +
                "\nperimeter = " + getPerimeter() + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.radius *= percent / 200;
    }
}
