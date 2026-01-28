package module_12.hometask.task_02;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class FizzBuzz {
    private final int n;

    private final BlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

    private final Object  lock = new Object();
    private int current = 1;
    private boolean produced = false;

    FizzBuzz(int n) {
        this.n = n;
    }

    public void fizz() throws InterruptedException {
        while (true) {
            String token;

            synchronized (lock) {
                while (current <= n && (produced || !(current % 3 == 0 && current % 5 != 0))) {
                    lock.wait();
                }
                if (current > n) return;

                produced = true;
                token = "fizz";
                lock.notifyAll();
            }

            queue.put(token);
        }
    }

    public void buzz() throws InterruptedException {
        while (true) {
            String token;

            synchronized (lock) {
                while (current <= n && (produced || !(current % 5 == 0 && current % 3 != 0))) {
                    lock.wait();
                }
                if (current > n) return;

                produced = true;
                token = "buzz";
                lock.notifyAll();
            }

            queue.put(token);
        }
    }

    public void fizzBuzz() throws InterruptedException {
        while (true) {
            String token;

            synchronized (lock) {
                while (current <= n && (produced || !(current % 15 == 0)))  {
                    lock.wait();
                }
                if (current > n) return;

                produced = true;
                token = "fizzbuzz";
                lock.notifyAll();
            }

            queue.put(token);
        }
    }

    public void number() throws InterruptedException {
        boolean first = true;

        while (true) {
            int value;

            synchronized (lock) {
                if (current > n) {
                    lock.notifyAll();
                    break;
                }
                value = current;
                produced = false;
                lock.notifyAll();
            }

            if (value % 3 != 0 && value % 5 != 0) {
                queue.put(String.valueOf(value));
            }

            String out = queue.take();

            if (first) {
                System.out.println(out);
                first = false;
            }  else {
                System.out.println(out);
            }
            if (value == n) System.out.println();

            synchronized (lock) {
                current++;
                lock.notifyAll();
            }
        }
    }
}