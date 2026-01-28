package core.com.module_07;

class DoubleSpaceCleaner {
    public String clean(String phrase) {
        String str = phrase.strip().replaceAll("\\s+", " ");
        return str;
    }
}

class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}
