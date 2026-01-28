package module_12;

public class ThreadHello extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from thread");
    }
}

class ThreadTest {
    public static void main(String[] args) {
        new ThreadHello().start();
    }
}