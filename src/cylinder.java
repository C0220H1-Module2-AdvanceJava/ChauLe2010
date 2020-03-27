public class cylinder extends circle {
    private double hei = 1.0;
    public cylinder(){
    }
    public cylinder(double hei){
        this.hei = hei;
    }
    public cylinder(String color,double radius, double hei){
        super(color,radius);
        this.hei = hei;
    }
    public double getHei(){
        return hei;
    }
    public void setHei(double hei){
        this.hei = hei;
    }
    @Override
    public String toString(){
        return "cylinder with height = "
                + getHei()
                + " is a subclass of circle with radius = "
                + getRadius()
                + " is a subclass of circle with color = "
                + getColor();
    }

    public static void main(String[] args) {
        cylinder cylinder = new cylinder();
        System.out.println(cylinder);
        cylinder = new cylinder(6);
        System.out.println(cylinder);
        cylinder = new cylinder("white",4,6);
        System.out.println(cylinder);
    }
}
