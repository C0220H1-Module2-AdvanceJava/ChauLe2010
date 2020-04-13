package product.controller;

import product.model.Product;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class ProductManager implements Serializable {
    private static final long serialVersionUID = 1L;
    private HashMap<String, Product> productMap = new LinkedHashMap<>();

    public void add(String ID, Product product) {
        productMap.put(ID, product);
    }

    public void remove(String ID) {
        productMap.remove(ID);
    }

    public Product searchByID(String ID) {
        return productMap.get(ID);
    }

    public String toString() {
        String format = "|%3s |%21s |%12s |%10d |%21s |%13s |\n";
        StringBuilder data = new StringBuilder();
        StringBuilder header = new StringBuilder();
        StringBuilder footer = new StringBuilder();
        StringBuilder result = new StringBuilder();
        Set<String> keySet = productMap.keySet();
        header.append("+----+----------------------+-------------+-----------+----------------------+--------------+\n");
        header.append("| ID |         Name         |     Brand   |   Price   |        Bar Code      |  Description |\n");
        header.append("+----+----------------------+-------------+-----------+----------------------+--------------+\n");
        footer.append("+----+----------------------+-------------+-----------+----------------------+--------------+\n");
        footer.append("Tổng số: " + keySet.size() + " sản phẩm " + "\n");
        for (String key : keySet) {
            data.append(String.format(format
                    , key
                    , productMap.get(key).getName()
                    , productMap.get(key).getBrand()
                    , productMap.get(key).getPrice()
                    , productMap.get(key).getBarCode()
                    , productMap.get(key).getDescription()));
        }
        result.append(header).append(data).append(footer);
        return result.toString();
    }

    public HashMap<String, Product> toHashMap() {
        return productMap;
    }

    public int size() {
        return productMap.size();
    }
}
