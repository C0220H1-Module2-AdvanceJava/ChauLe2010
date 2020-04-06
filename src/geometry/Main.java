package geometry;


public class Main {
    public static void main(String[] args) {
        //test polymorphic of array geometries
        Geometry[] geometries = new Geometry[3];
        geometries[0] = new Circle();
        geometries[1] = new Rectangle();
        geometries[2] = new Square();
        for (Geometry geometry : geometries) {
            double randomNumber = Math.ceil(Math.random() * 100);
            geometry.resize(randomNumber);
        }
        for (Geometry geometry : geometries) {
            System.out.println(geometry);
        }
        //test class square implement interface colorable
        System.out.println();
        for (Geometry geometry : geometries) {
            if (geometry instanceof Square) {
                ((Square) geometry).howToColor();
            } else {
                System.out.println(geometry);
            }
        }
    }
}