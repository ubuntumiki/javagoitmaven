package core.com.module_08.hometask;

public class PrinterShape implements ShapePrinter{
    @Override
    public void print(Shape shape) {
        shape.printShapeName();
    }
}
