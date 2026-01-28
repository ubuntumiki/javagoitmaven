package core.com.module_07;

public class StaticClassTests {
    public static void main(String[] args) {
        HelloPrinter printer = new HelloPrinter();
        printer.printHello("Miki");
    }

    public static class HelloPrinter{
        public void printHello(String name) {
            System.out.println("Hello" + name);
        }
    }
}
