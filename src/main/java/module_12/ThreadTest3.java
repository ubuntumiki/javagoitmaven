package module_12;

class ThreadTest3 {
    public static void main(String[] args) throws InterruptedException {
        Thread printThread = new Thread(() -> {
            System.out.println("Exec thread");

            synchronized (Thread.currentThread()) {
                try {
                    Thread.currentThread().wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Finish exec thread");
        });

        printThread.start();

        Thread.sleep(2000);

        synchronized (printThread) {
            printThread.notify();
        }
    }
}

