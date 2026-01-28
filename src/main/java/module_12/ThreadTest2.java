package module_12;

class ThreadTest2 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello from thread")).start();
    }
}

