package functionalinterfacetest;


import functionalinterface.IntegerSwapper;
import org.junit.Test;
        import static org.junit.Assert.*;

public class IntegerSwapperTest {
    @Test
    public void testSwapWithoutTemp() {
        // Test case for positive numbers
        int a = 5;
        int b = 10;
        IntegerSwapper.swapWithoutTemp(a, b);
        assertEquals(10, a);
        assertEquals(5, b);

        // Test case for negative numbers
        a = -8;
        b = -3;
        IntegerSwapper.swapWithoutTemp(a, b);
        assertEquals(-3, a);
        assertEquals(-8, b);

    }
}
