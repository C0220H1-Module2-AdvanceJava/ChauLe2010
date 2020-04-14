package resizeable.shape;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

//    @Override
//    public String toString() {
//        return "A Square with side = "
//                + getSide()
//                + " has area = "
//                + super.getArea()
//                + " and perimeter = "
//                + super.getPerimeter()
//                + " ,which is a subclass of "
//                + super.toString();
//    }
@Override
public String toString() {
    return "A Square with Side = "
            + getSide()
            + " ,Which is a Subclass of "
            + super.toString();
}

    public void resize(double percent) {
        double newSide = getSide() * (percent/100 + 1);
        System.out.println("New Side of Square = " + newSide);
    }
}
