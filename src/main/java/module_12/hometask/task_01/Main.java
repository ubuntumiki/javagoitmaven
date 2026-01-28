package module_12.hometask.task_01;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long startMillis = System.currentTimeMillis();

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        scheduler.scheduleAtFixedRate(() -> {
            long elapsed = System.currentTimeMillis() - startMillis;
            System.out.println("Минуло від старту: " + formatElapsed(elapsed));
        }, 0, 1, TimeUnit.SECONDS);

        scheduler.scheduleAtFixedRate(() -> System.out.println("Минуло 5 сек."), 5, 5, TimeUnit.SECONDS);

        Thread.currentThread().join();
    }

    private static String formatElapsed(long elapsedMillis) {
        Duration d = Duration.ofMillis(elapsedMillis);
        return String.format("%02d:%02d:%02d", d.toHours(), d.toMinutesPart(), d.toSecondsPart());
    }
}
