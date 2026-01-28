package core.com.module_09.testarraylist;

public class MyArrayListTests {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }
//        list.add(1);
//        list.add(5);

        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(0) = " + list.get(0));
    }
}
