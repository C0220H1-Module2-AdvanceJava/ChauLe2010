public class Triangle extends Shape {
    public double side1 = 1.0;
    public double side2 = 1.0;
    public double side3 = 1.0;

    public Triangle(){
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea(){
        double p = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    public double getPerimeter(){
        return this.side1 + this.side3 + this.side2;
    }

    @Override
    public String toString() {
        return "Tam giác có 3 cạnh lần lượt là: "
                + this.side1 + ", "
                + this.side2 + ", "
                + this.side3 + ", "
                + "là một lớp con của "
                + super.toString();
    }
}
