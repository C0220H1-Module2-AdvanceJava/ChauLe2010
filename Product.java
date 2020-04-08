public class Product {
    public float price = 4500;
    public String name = "Iphone";
    public int ID = 1;
    public Product(){

    }

    public Product(float price, String name, int ID) {
        this.price = price;
        this.name = name;
        this.ID =  ID;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", id=" + ID +
                '}';
    }
}
