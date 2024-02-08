package objectarrays;

public class Product implements Comparable<Product> {
    private double weight;
    private double price;
    private int id;

    public Product(double weight, double price, int id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return Double.compare(this.price, otherProduct.price);
    }
}

