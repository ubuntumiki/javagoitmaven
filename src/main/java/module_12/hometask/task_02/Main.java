package module_12.hometask.task_02;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int n = 30;

        FizzBuzz fb = new FizzBuzz(n);

        Thread A =  new Thread(() -> runSafely(fb::fizz), "A-fizz");
        Thread B =  new Thread(() -> runSafely(fb::buzz), "B-buzz");
        Thread C =  new Thread(() -> runSafely(fb::fizzBuzz), "C-fizzbuzz");
        Thread D =  new Thread(() -> runSafely(fb::number), "D-number");

        A.start();
        B.start();
        C.start();
        D.start();

        A.join();
        B.join();
        C.join();
        D.join();
    }

    private static void runSafely(ThrowingRunnable r) {
        try {
            r.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
