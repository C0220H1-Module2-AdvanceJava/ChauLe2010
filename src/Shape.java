public abstract class Shape implements Resizeable {
    private String color;
    private boolean filled;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "\nColor: "
                + getColor() +
                "\nfilled: " + isFilled();
    }

    public static void printShape(Shape[] shapes) {
        for (Shape x : shapes) {
            System.out.println(x.toString());
        }
    }
}
