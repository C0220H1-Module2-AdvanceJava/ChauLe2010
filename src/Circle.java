public class Circle extends Geometric {
    private double radius;
    private static final int COEFFICIENT = 2;
    private static final double PI = Math.PI;

    public Circle() {
        radius = 1.0;
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

    @Override
    public boolean getFilled() {
        return super.getFilled();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public double getDiameter() {
        return COEFFICIENT * radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * PI;
    }

    @Override
    public double getPerimeter() {
        return getDiameter() * PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + radius
                + ", which is a subclass of "
                + super.toString()
                + "\n"
                + "Perimeter = "
                + super.decimalFormat.format(getPerimeter())
                + " - Area = "
                + super.decimalFormat.format(getArea());
    }

    @Override
    public void inputData() {
        super.inputData();
        System.out.print("Enter radius: ");
        setRadius(super.scanner.nextDouble());
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.printf("Perimeter: %.2f - Area: %.2f \n \n",getPerimeter(),getArea());
    }
}
