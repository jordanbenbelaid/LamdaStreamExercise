public class Product {

    private String name;
    private double price;
    private String category;

    // Task 2.2: Constructor
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Task 2.3: Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    // Useful for printing objects
    @Override
    public String toString() {
        return name + " (£" + price + ", " + category + ")";
    }
}
