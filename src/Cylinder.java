public class Cylinder extends Circle {
    private double height;
    private static final int COEFFICIENT = 2;

    public Cylinder() {
        height = 1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(String color, boolean filled, double radius, double height) {
        super(color, filled, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean getFilled() {
        return super.getFilled();
    }

    public double getSurfaceArea() {
        return super.getPerimeter() * height;
    }

    public double getTotalArea() {
        return getSurfaceArea() + super.getArea() * COEFFICIENT;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
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
        return "A Cylinder with height = "
                + height
                + " and radius = "
                + super.getRadius()
                + "\n"
                + "Which is a subclass of "
                + super.toString()
                + "\n"
                + "Surface area = "
                + super.decimalFormat.format(getSurfaceArea())
                + " - Total area = "
                + super.decimalFormat.format(getTotalArea())
                + " - Volume = "
                + super.decimalFormat.format(getVolume());
    }

    @Override
    public void inputData() {
        super.inputData();
        System.out.print("Enter height: ");
        setHeight(super.scanner.nextDouble());
    }

    @Override
    public void displayData() {
        System.out.println("Here is the result: ");
        System.out.printf("Surface Area: %.2f - Total Area: %.2f - Volume: %.2f \n \n"
                , getSurfaceArea(), getTotalArea(), getVolume());
    }
}
