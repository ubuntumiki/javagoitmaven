package core.com.module_07;

class StringBuilderTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String result = "";
        for (int i = 1; i < 100_000; i++) {
            result += i;
        }

//        System.out.println(result);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        long start2 = System.currentTimeMillis();
        StringBuilder result2 = new StringBuilder();
        for (int i = 1; i < 100_000; i++) {
            result2.append(i);
        }

//        System.out.println(result2);
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
    }
}
