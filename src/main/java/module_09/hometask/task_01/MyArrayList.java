package core.com.module_09.hometask.task_01;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] values = new Object[10];
    private int size = 0;

    public void add(T obj) {
        rebalance();
        values[size] = obj;
        size++;
    }

    public T remove(int index) {
        T removed = (T) values[index];
        for (int i = index; i < size - 1; i++) {
            values[i] = values[i + 1];
        }
        values[size - 1] = null;
        size--;

        return removed;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            values[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        return (T) values[index];
    }

    private void rebalance() {
        if (values.length == size) {
            values = Arrays.copyOf(values, values.length * 2);
        }
    }
}
