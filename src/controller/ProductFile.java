package controller;

import repository.ProductRepoImpl;

import java.io.*;
import java.util.ArrayList;

public class ProductFile extends ProductRepoImpl {
    private static String filePath = "ListProduct.txt";

    public ProductFile() {
    }

    public void writeFile() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(filePath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public void readFile() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);

            var resultList = (ArrayList) ois.readObject();

            for (var obj : resultList) {
                System.out.println(obj);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
