class OddEven{
    private int max;
    private int number = 1;
    private boolean isOdd = true;

    public OddEven(int max) {
        this.max = max;
    }

    public synchronized void printOdd() {
        while (number <= max) {
            while (!isOdd) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Odd: " + number);
            number++;
            isOdd = false;
            notify();
        }
    }

    public synchronized void printEven() {
        while (number <= max) {
            while (isOdd) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Even: " + number);
            number++;
            isOdd = true;
            notify();
        }
    }
}

public class practical3_10 {
    public static void main(String[] args) {
        OddEven printer = new OddEven(20);

        Thread oddThread = new Thread(() -> {
            printer.printOdd();
        });

        Thread evenThread = new Thread(() -> {
            printer.printEven();
        });

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}