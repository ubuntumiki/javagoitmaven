package core.com.module_09.testarraylist;

import java.util.Arrays;

public class MyArrayListTwo<T> {
    private Object[] values = new Object[10];
    private int size = 0;

    public void add(T obj) {
        rebalance();
        values[size] = obj;
        size++;
    }

    public T get(int index) {
        return (T) values[index];
    }

    private void rebalance() {
        if (values.length == size) {
            values = Arrays.copyOf(values, values.length + 5);
        }
    }

    public static void main(String[] args) {
        MyArrayListTwo<String> arrayList = new MyArrayListTwo<>();
        arrayList.add("abc0");
        arrayList.add("abc1");
        arrayList.add("abc2");
        arrayList.add("abc3");
        arrayList.add("abc4");
        arrayList.add("abc5");
        arrayList.add("abc6");
        arrayList.add("abc7");
        arrayList.add("abc8");
        arrayList.add("abc9");
        arrayList.add("abc10");
        arrayList.add("ab11");

        System.out.println("arrayList.get(0) = " + arrayList.get(0));
        System.out.println("arrayList.get(0) = " + arrayList.get(11));
//        System.out.println("arrayList.get(0) = " + arrayList.get(14));
    }
}
