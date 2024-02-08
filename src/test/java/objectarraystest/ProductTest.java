package objectarraystest;

import objectarrays.Product;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void testCompareTo() {
        Product product1 = new Product(1.5, 10.99, 101);
        Product product2 = new Product(2.0, 8.99, 102);
        Product product3 = new Product(1.0, 10.99, 103);

        assertTrue(product1.compareTo(product2) > 0); // product1 should be more expensive than product2
        assertTrue(product2.compareTo(product1) < 0); // product2 should be cheaper than product1
        assertTrue(product1.compareTo(product3) == 0); // product1 and product3 should have the same price
    }
}



