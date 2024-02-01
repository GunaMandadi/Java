package oops;

public class Product {
    private double price; // Variable to store the price for single quantity

    // Getter method for price
    public double getPrice() {
        return price;
    }

    // Setter method for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Overloaded method for price getter based on quantity
    public double getPrice(int quantity) {
        // Assuming there is a discount for bulk purchases, adjust the price accordingly
        // For simplicity, let's say the price reduces by 10% for every 10 units purchased
        int discountQuantity = 10;
        double discountPercentage = 0.1;

        int numOfDiscounts = quantity / discountQuantity;
        double discountedPrice = price - (price * discountPercentage * numOfDiscounts);

        return discountedPrice;
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        // Create an instance of Product
        Product product = new Product();

        // Set the price for single quantity using the setter method
        product.setPrice(10.0);

        // Retrieve and print the price for single quantity using the getter method
        System.out.println("Price for single quantity: " + product.getPrice());

        // Calculate and print the price based on a specific quantity using the overloaded getPrice method
        int quantity = 15;
        System.out.println("Price for " + quantity + " quantity: " + product.getPrice(quantity));
    }
}

