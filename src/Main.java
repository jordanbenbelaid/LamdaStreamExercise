import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // =====================================================
        // Step 4: Create Product List
        // =====================================================
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200, "Electronics"),
                new Product("Phone", 800, "Electronics"),
                new Product("Desk", 300, "Furniture"),
                new Product("Chair", 150, "Furniture"),
                new Product("Headphones", 200, "Electronics"),
                new Product("Book", 40, "Education")
        );


        // =====================================================
        // Task 5: Display All Product Names Using Streams
        // =====================================================
        System.out.println("Task 5: All products");

        products.stream()
                .forEach(p -> System.out.println(p.getName()));


        // =====================================================
        // Task 6: Filter Expensive Products (>500)
        // =====================================================
        System.out.println("\nTask 6: Expensive products (>500)");

        products.stream()
                .filter(p -> p.getPrice() > 500)
                .forEach(p -> System.out.println(p.getName()));


        // =====================================================
        // Task 7: Convert Product Names to Uppercase
        // =====================================================
        System.out.println("\nTask 7: Product names in uppercase");

        products.stream()
                .map(p -> p.getName())
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));


        // =====================================================
        // Task 8: Filter Products by Category (Electronics)
        // =====================================================
        System.out.println("\nTask 8: Electronics products");

        products.stream()
                .filter(p -> p.getCategory().equals("Electronics"))
                .forEach(p -> System.out.println(p.getName()));


        // =====================================================
        // Task 9: Sort Products by Price (Lowest → Highest)
        // =====================================================
        System.out.println("\nTask 9: Products sorted by price");

        products.stream()
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .forEach(p -> System.out.println(p.getName() + " - £" + p.getPrice()));


        // =====================================================
        // Task 10: Combine Operations
        // Electronics products > 500, uppercase
        // =====================================================
        System.out.println("\nTask 10: Expensive electronics in uppercase");

        products.stream()
                .filter(p -> p.getCategory().equals("Electronics"))
                .filter(p -> p.getPrice() > 500)
                .map(p -> p.getName())
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));


        // =====================================================
        // Task 11: Count Products Less Than 300
        // =====================================================
        System.out.println("\nTask 11: Count products cheaper than £300");

        long count = products.stream()
                .filter(p -> p.getPrice() < 300)
                .count();

        System.out.println("Count: " + count);


        // =====================================================
        // Task 12: Find Most Expensive Product
        // =====================================================
        System.out.println("\nTask 12: Most expensive product");

        Product mostExpensive = products.stream()
                .max((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .orElse(null);

        if (mostExpensive != null) {
            System.out.println(mostExpensive.getName() + " - £" + mostExpensive.getPrice());
        }


        // =====================================================
        // Bonus Task: Collect Furniture Products into New List
        // =====================================================
        System.out.println("\nBonus Task: Furniture products collected into list");

        List<Product> furnitureProducts = products.stream()
                .filter(p -> p.getCategory().equals("Furniture"))
                .collect(Collectors.toList());

        furnitureProducts.forEach(p -> System.out.println(p.getName()));
    }
}
