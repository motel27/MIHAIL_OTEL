package homework_nr_19;

public class Multithreading {

    static class EvenThread extends Thread {
        @Override
        public void run() {
            try {
                for (int a = 0; a < 10; a += 2) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("EvenThread interrupted.");
                        break;
                    }
                    System.out.println("Even number: " + a);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("EvenThread was interrupted during sleep.");
            }
        }
    }
    static class OddRunnable implements Runnable {
        @Override
        public void run() {
            try {
                for (int b = 1; b < 10; b += 2) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("OddRunnable interrupted.");
                        break;
                    }
                    System.out.println("Odd number: " + b);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("OddRunnable was interrupted during sleep.");
            }
        }
    }

    public static void main(String[] args) {
        Thread evenThread = new EvenThread();
        Thread oddThread = new Thread(new OddRunnable());

            evenThread.start();
            oddThread.start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

            evenThread.interrupt();
            oddThread.interrupt();

        System.out.println("Streams are interrupted.");
    }
}
