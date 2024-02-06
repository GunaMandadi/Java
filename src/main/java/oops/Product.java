package oops;

public class Product {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.setPrice(10.0);
        double price = product.getPrice();
        System.out.println("Price of the product: $" + price);
        int quantity = 5;
        double totalPrice = product.getPrice(quantity);
        System.out.println("Total price for " + quantity + " items: $" + totalPrice);
    }
}

