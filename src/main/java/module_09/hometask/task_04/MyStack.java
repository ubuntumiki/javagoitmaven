package core.com.module_09.hometask.task_04;

public class MyStack<T> {
    private StackNode<T> first;
    private StackNode<T> last;
    private int size = 0;

    public void push(T value) {
        StackNode<T> node = new StackNode<>(value);

        if (last == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Error");
        }

        StackNode<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        T removed = current.value;

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            first = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            last = current.prev;
        }

        size--;
        return removed;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (last == null) {
            return null;
        }
        return last.value;
    }

    public T pop() {
        if (last == null) {
            return null;
        }

        T value = last.value;

        if (first == last) {
            first = null;
            last = null;
        } else {
            last = last.prev;
            last.next = null;
        }

        size--;
        return value;
    }
}
