import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("HD Case", 80.90));

        // list.removeIf(new ProductPredicate()); // Predicate<Product> is a functional interface
        // list.removeIf(Product::staticProductPredicate); // Reference to a static method
        // list.removeIf(Product::nonStaticProductPredicate); // Reference to a non-static method

        /*Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        list.removeIf(pred);*/ // Declared lambda expression

        list.removeIf(p -> p.getPrice() >= 100.0); // Inline lambda expression

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
