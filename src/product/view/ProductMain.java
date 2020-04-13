package product.view;

import product.controller.ProductManager;
import product.controller.Serializator;
import product.model.Product;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class ProductMain {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductManager productManager;
    private static Serializator serializator = new Serializator();

    public static void main(String[] args) {
        boolean isNextOption = false;
        Product product;
        while (!isNextOption) {
            System.out.println("----------Main Menu----------");
            System.out.println("1. Mở file quản lý");
            System.out.println("2. Tạo file quản lý mới");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Nhập đường dẫn file: ");
                    String source = scanner.nextLine();
                    try {
                        productManager = serializator.readFromFile(source);
                        isNextOption = true;
                    } catch (FileNotFoundException e) {
                        System.out.println("File không tồn tại!");
                    } catch (ClassNotFoundException | StreamCorruptedException e) {
                        System.out.println("File không phù hợp!");
                    } catch (IOException e) {
                        System.out.println("Có lỗi xảy ra!");
                    }
                    break;
                case 2:
                    productManager = new ProductManager();
                    serializator = new Serializator(productManager);
                    isNextOption = true;
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không phù hợp! Vui lòng chọn lại");
            }
        }

        if (productManager == null) {
            System.exit(0);
        }

        while (isNextOption) {
            System.out.println("\n+----+----------------------+-------------+-----------+----------------------+--------------+");
            System.out.println("|                                  Product Manager v1.0                                     |");
            System.out.println(productManager);
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Tìm sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xoá sản phẩm");
            System.out.println("5. Lưu dữ liệu vào file");
            System.out.println("6. Xuất bảng ra file văn bản");
            System.out.println("0. Thoát chương trình");
            System.out.println();
            System.out.print("Nhập lựa chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    product = new Product();
                    System.out.print("Nhập ID sản phẩm: ");
                    String ID = scanner.next();
                    scanner.nextLine();
                    if (productManager.searchByID(ID) != null) {
                        System.out.println("Sản phẩm đã tồn tại. Vui lòng chọn ID khác!");
                        break;
                    }
                    updateData(product);
                    productManager.add(ID,product);
                    break;
                case 2:
                    System.out.print("Nhập ID sản phẩm: ");
                    ID = scanner.next();
                    scanner.nextLine();
                    product = productManager.searchByID(ID);
                    System.out.println("Thông tin sản phẩm hiển thị ở dưới: ");
                    System.out.println(product);
                    System.out.print("\nXuất dữ liệu ra file văn bản ? (yes/no): ");
                    char confirm = scanner.next().toLowerCase().charAt(0);
                    if (confirm == 'y') {
                        String path = "src/product/storage/" + product.getName() + ".txt";
                        try {
                            serializator.exportToText(path, product);
                        } catch (IOException ex) {
                            System.out.println("Có lỗi xảy ra: " + ex.getMessage());
                        } finally {
                            System.out.println("Hoàn thành!");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập ID sản phẩm: ");
                    ID = scanner.next();
                    scanner.nextLine();
                    product = productManager.searchByID(ID);
                    updateData(product);
                    break;
                case 4:
                    System.out.print("Nhập ID sản phẩm: ");
                    ID = scanner.next();
                    scanner.nextLine();
                    productManager.remove(ID);
                    break;
                case 5:
                    System.out.println("1. Lưu thành file mới");
                    System.out.println("2. Save lên file đã có sẵn");
                    System.out.print("Nhập lựa chọn: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.print("Nhập tên file: ");
                            String path = "src/product/storage/" + scanner.nextLine() + ".dat";
                            File file = new File(path);
                            try {
                                serializator.writeToFile(path);
                            } catch (FileAlreadyExistsException e) {
                                System.out.print("File đã tồn tại. Lưu đè ? (yes/no): ");
                                confirm = scanner.next().toLowerCase().charAt(0);
                                if (confirm == 'y') {
                                    file.delete();
                                    try {
                                        serializator.writeToFile(path);
                                    } catch (IOException ex) {
                                        System.out.println("Có lỗi xảy ra: " + ex.getMessage());
                                    }
                                }
                            } catch (IOException ex) {
                                System.out.println("Có lỗi xảy ra: " + ex.getMessage());
                            } finally {
                                System.out.println("Hoàn thành!");
                            }
                            break;
                        case 2:
                            try {
                                serializator.writeToFile();
                            } catch (IOException ex) {
                                System.out.println("Có lỗi xảy ra: " + ex.getMessage());
                            } finally {
                                System.out.println("Hoàn thành!");
                            }
                            break;
                    }
                    break;
                case 6:
                    System.out.print("Nhập tên file: ");
                    String path = "src/product/storage/" + scanner.nextLine() + ".txt";
                    File file = new File(path);
                    try {
                        serializator.exportToText(path,productManager);
                    } catch (FileAlreadyExistsException e) {
                        System.out.print("File đã tồn tại. Lưu đè ? (yes/no): ");
                        confirm = scanner.next().toLowerCase().charAt(0);
                        if (confirm == 'y') {
                            file.delete();
                            try {
                                serializator.exportToText(path,productManager);
                            } catch (IOException ex) {
                                System.out.println("Có lỗi xảy ra: " + ex.getMessage());
                            }
                        }
                    } catch (IOException ex) {
                        System.out.println("Có lỗi xảy ra: " + ex.getMessage());
                    } finally {
                        System.out.println("Hoàn thành!");
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    isNextOption = false;
                    break;
                default:
                    System.out.println("Lựa chọn không phù hợp");
            }
        }
    }

    private static void updateData(Product product) {
        System.out.print("Nhập tên sản phẩm: ");
        product.setName(scanner.nextLine());
        System.out.print("Nhập hãng của sản phẩm: ");
        product.setBrand(scanner.nextLine());
        System.out.print("Nhập giá của sản phẩm: ");
        product.setPrice(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nhập barcode của sản phẩm: ");
        product.setBarCode(scanner.nextLine());
        System.out.print("Nhập mô tả: ");
        product.setDescription(scanner.nextLine());
    }
}
