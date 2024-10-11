import java.util.Scanner;

class ProducerConsumer {
    private int item = -1; // Shared item
    private boolean isProduced = false;

    synchronized void produce(int itemCount) {
        for (int i = 0; i < itemCount; i++) {
            while (isProduced) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            item = i + 1; // Produce item (starting from 1)
            isProduced = true;
            System.out.println("Produced: " + item);
            notifyAll();
        }
        synchronized (this) {
            while (isProduced) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            item = 0; // End signal for consumer
            isProduced = true;
            notifyAll();
        }
    }

    synchronized void consume() {
        while (true) {
            while (!isProduced) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            if (item == 0) {
                break; // End signal received
            }
            System.out.println("Consumed: " + item);
            isProduced = false;
            notifyAll();
        }
    }
}

class Producer extends Thread {
    ProducerConsumer pc;
    int itemCount;

    Producer(ProducerConsumer pc, int itemCount) {
        this.pc = pc;
        this.itemCount = itemCount;
    }

    public void run() {
        pc.produce(itemCount);
    }
}

class Consumer extends Thread {
    ProducerConsumer pc;

    Consumer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        pc.consume();
    }
}

public class TestSynchronization {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items to produce: ");
        int itemCount = scanner.nextInt();

        ProducerConsumer pc = new ProducerConsumer();
        Producer producer = new Producer(pc, itemCount);
        Consumer consumer = new Consumer(pc);

        producer.start();
        consumer.start();
    }
}

