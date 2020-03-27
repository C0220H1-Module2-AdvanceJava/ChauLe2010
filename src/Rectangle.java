public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    @Override
    public String toString() {
        return "\n A Rectangle width = " + getWidth() +
                "\nheight = " + getHeight() +
                "\nArea = " + getArea() +
                "\nPerimeter = " + getPerimeter() +
                super.toString();
    }

    @Override
    public void resize(double percent) {
        this.width *= percent /200;
        this.height *= percent / 200;
    }
}
