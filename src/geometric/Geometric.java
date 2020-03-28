package geometric;

import control.IGeometric;

import java.text.DecimalFormat;
import java.util.Scanner;

public abstract class Geometric implements IGeometric {
    private String color;
    private boolean filled;
    protected DecimalFormat decimalFormat = new DecimalFormat("0.00");
    protected Scanner scanner = new Scanner(System.in);

    public boolean getFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    protected abstract double getArea();

    protected abstract double getPerimeter();

    @Override
    public String toString() {
        return "A shape with color of "
                + color
                + " and "
                + (filled ? "filled" : "not filled");
    }

    //    public Geometric() {
    //        color = "green";
    //        filled = true;
    //    }
    //
    //    public Geometric(String color, boolean filled) {
    //        this.color = color;
    //        this.filled = filled;
    //    }
}
