class Buffer {
    private int[] buffer;
    private int capacity;
    private int size;
    private int in; 
    private int out; 
    public Buffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.size = 0;
        this.in = 0;
        this.out = 0;
    }

    public synchronized void produce(int item) {
        while (size == capacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        buffer[in] = item;
        in = (in + 1) % capacity;
        size++;

        System.out.println("Produced: " + item);
        notify();
    }

    public synchronized int consume() {
        while (size == 0) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int item = buffer[out];
        out = (out + 1) % capacity;
        size--;

        System.out.println("Consumed: " + item);
        notify();
        return item;
    }
}

class Producer extends Thread {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            int item = buffer.consume();
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class practical3_9 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
