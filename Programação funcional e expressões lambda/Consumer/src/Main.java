import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("HD Case", 80.90));

        // list.forEach(new PriceUpdate()); // Interface Consumer
        // list.forEach(Product::staticPriceUpdate); // Method reference static
        // list.forEach(Product::nonStaticPriceUpdate); // Method reference non-static

        /*Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
        list.forEach(cons);*/

        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        list.forEach(System.out::println);
    }
}
