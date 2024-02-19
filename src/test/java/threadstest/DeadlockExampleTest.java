package threadstest;


import org.junit.Test;
import threads.DeadlockExample;

public class DeadlockExampleTest {

    @Test(timeout = 1000)
    public void testDeadlock() throws InterruptedException {
        Runnable deadlockTask = () -> DeadlockExample.main(new String[]{});

        Thread thread1 = new Thread(deadlockTask);
        Thread thread2 = new Thread(deadlockTask);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
