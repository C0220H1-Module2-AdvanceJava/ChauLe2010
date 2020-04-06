public class circle {
    private String color = "blue";
    private double radius = 1.0 ;
    public circle(){
    }
    public circle(String color,double radius){
        this.color = color;
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public double getRadius(){
        return radius;
    }
    public void setColor(){
        this.color = color;
    }
    public void setRadius(){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    @Override
    public String toString(){
        return "circle with radius: "
                + getRadius()
                +" and color "
                +getColor();
    }
    public static void main(String[] args) {
        circle circle = new circle();
        System.out.println(circle);
        circle = new circle("black",6.4);
        System.out.println(circle);
    }
}
