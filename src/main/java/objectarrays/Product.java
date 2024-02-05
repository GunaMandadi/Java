package objectarrays;


public class Product implements Comparable<Product> {
    private final int id;
    private final double weight;
    private final double price;

    // Constructor
    public Product(int id, double weight, double price) {
        this.id = id;
        this.weight = weight;
        this.price = price;
    }

    // Implementing compareTo method to compare products based on their price
    @Override
    public int compareTo(Product otherProduct) {
        return Double.compare(this.price, otherProduct.price);
    }

    // toString method to print Product details
    @Override
    public String toString() {
        return "Product [id=" + id + ", weight=" + weight + ", price=" + price + "]";
    }
}
