import entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Product, Double> cookies = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1900.0);
        Product p3 = new Product("Tablet", 800.0);

        cookies.put(p1, 10000.0);
        cookies.put(p2, 20000.0);
        cookies.put(p3, 30000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + cookies.containsKey(ps));

    }
}
