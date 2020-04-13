public class Main {
    public static void main(String[] args) {
        FunctionProduct functionProduct = new FunctionProduct();

        functionProduct.creatObject();

        String path = "G:\\codegym\\module2\\btQuanLySanPham\\src\\example.txt";
        functionProduct.writeToFile(functionProduct.containsObject, path);

        functionProduct.readFromFile(path);

        functionProduct.displayProduct();

        Product searchById = functionProduct.searchProduct(3);

        System.out.println(searchById.toString());
    }
}