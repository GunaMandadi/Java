package threads;


public class EvenOddPrinter {

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenPrinter());
        Thread oddThread = new Thread(new OddPrinter());

        evenThread.start();
        oddThread.start();
    }
}

class EvenPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 60; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(100); // Just for demonstration, to slow down printing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 59; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(100); // Just for demonstration, to slow down printing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
