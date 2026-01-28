package core.com.module_09.testarraylist;

import java.util.StringJoiner;

public class MyArrayList {
    private static final int INIT_SIZE = 1;

    private int[] data;
    private int index;

    public MyArrayList() {
        data = new int[INIT_SIZE];

    }

    public void add(int value) {
        resizeIfNeed();
        data[index] = value;
        index++;
    }

    private void resizeIfNeed() {
        if (index == data.length) {
            System.out.println("Resize happened, index: " + index + ", data.length " + data.length);
            int newSize = data.length * 2;
            int[] newData = new int[newSize];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    public int get(int i) {
        return data[i];
    }

    public int size() {
        return index;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < index; i++) {
            result.add(Integer.toString(data[i]));
        }

        return "[" + result + "]";
    }
}
