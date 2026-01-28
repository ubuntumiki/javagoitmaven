package core.com.module_09;

class TypeArrayPrinter {
    public <E> void printArray(E[] data) {
        for(E item: data) {
            System.out.println(item);
        }
    }
}

class TypeArrayPrinterTest {
    public static void main(String[] args) {
        String[] items = {"Hello", "Java"};
        Integer[] years = {2000, 3000};

        TypeArrayPrinter typeArrayPrinter = new TypeArrayPrinter();
        typeArrayPrinter.printArray(items);
        typeArrayPrinter.printArray(years);
    }
}