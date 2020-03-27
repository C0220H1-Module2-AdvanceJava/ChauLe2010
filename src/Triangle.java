

public class Triangle extends Shape {

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3, String color) {
        super(side1, side2, side3, color);
    }

    public double getArea() {
        return Math.pow(
                ((getSide1()) + getSide2() + getSide3())
                        * ((getSide1()) + getSide2() - getSide3())
                        * (-(getSide1()) + getSide2() + getSide3())
                        * ((getSide1()) - getSide2() + getSide3())
                , 0.5) / 4;
    }

    public double getPerimeter() {
        return (getSide1()) + getSide2() + getSide3();
    }

    @Override
    public String toString() {
        return super.toString()
                + " - Area: "
                + getArea()
                + " - Perimeter: "
                + getPerimeter();
    }
}


