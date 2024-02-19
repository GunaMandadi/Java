package threadstest;


import org.junit.Test;
import threads.Singleton;

import static org.junit.Assert.assertSame;

public class SingletonTest {

    @Test
    public void testSingletonInstance() {
        // Get the instance of the singleton
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Check if both instances are the same
        assertSame(instance1, instance2);
    }
}
