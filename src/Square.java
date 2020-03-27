public class Square extends Shape {
    private double size;

    public Square() {

    }

    public Square(double size) {

    }

    public Square(double size, String color, boolean filled) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea() {
        return this.size * this.size;
    }

    public double getPerimeter() {
        return this.size * 4;
    }

    @Override
    public String toString() {
        return "\nA Square size = " + getSize() +
                "\nArea = " + getArea() +
                "\nPerimeter = " + getPerimeter() +
                super.toString();
    }

    @Override
    public void resize(double percent) {
        this.size *= percent / 200;
    }
}
