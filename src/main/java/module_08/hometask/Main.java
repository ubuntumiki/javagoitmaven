package core.com.module_08.hometask;

class Main {
    public static void main(String[] args) {

        ShapePrinter printer = new PrinterShape();

        printer.print(new Circle());
        printer.print(new Line());
        printer.print(new Rectangle());
        printer.print(new Square());
        printer.print(new Triangle());
    }
}
