package views;

import controller.ProductController;
import controller.ProductFile;
import model.Product;

import java.util.List;
import java.util.Scanner;

public class MainTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ProductController productController = new ProductController();
        int choice;
        do { showChoice();
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    List<Product> productList = productController.showProductList();
                    for (Product product : productList) {
                        System.out.println(product.toString());
                    }
                    break;
                case 2:
                    System.out.println("Add product: ");
                    Product product1 = createProduct();
                    productController.add(product1);
                    break;
                case 3:
                    System.out.println("Enter index for editing: ");
                    int indexEdit = scanner.nextInt();
                    productController.editProduct(indexEdit, createProduct());
                    break;
                case 4:
                    System.out.println("Enter index for removing:");
                    int indexRemove = scanner.nextInt();
                    productController.removeProduct(indexRemove);
                    break;
                case 5:
                    System.out.println("Enter a product Name:  ");
                    String name= scanner.nextLine();
                    System.out.println(productController.findByName(name));
                    break;
                case 6:
                    System.out.println("Enter a product ID:  ");
                    int id = scanner.nextInt();
                    productController.findById(id);
                    break;
                case 7:
                    System.out.println("Arrange product list upPrice");
                    productController.sortUp();
                    break;
                case 8:
                    System.out.println(" Arrange product list downPrice:");
                    productController.sortDown();
                    break;
                case 9:
                    System.out.println("Storing Product Information");
                    ProductFile productFile = new ProductFile();
                    productFile.writeFile();
                    productFile.readFile();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("You didn't make any choice");

            }
        } while (choice != 0);
    }

    public static void showChoice() {
        System.out.println("1. Show all products");
        System.out.println("2. Add a new product");
        System.out.println("3. Edit a product");
        System.out.println("4. Remove a product");
        System.out.println("5. Find a product by name");
        System.out.println("6. Find a product by ID");
        System.out.println("7. Arrange product list upPrice");
        System.out.println("8. Arange product list downPrice");
        System.out.println("9. Storing Product Information");

        System.out.println("0. Exit");
    }
    public static Product createProduct() {
        System.out.println("Enter ID Product: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Name Product: ");
        String name = scanner.nextLine();
        System.out.println("Enter Brand Product: ");
        String brand = scanner.nextLine();
        System.out.println("Enter Price Product: ");
        float price = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter Status Product: ");
        String status = scanner.nextLine();
        System.out.println("Enter Description Product: ");
        String description = scanner.nextLine();

        Product product = new Product(id, name, brand, price, status, description);

        return product;
    }
}
