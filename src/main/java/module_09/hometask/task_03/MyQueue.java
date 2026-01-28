package core.com.module_09.hometask.task_03;

public class MyQueue<T> {
    private QueueNode<T> first;
    private QueueNode<T> last;
    private int size = 0;

    public void add( T value) {
        QueueNode<T> node = new QueueNode<>(value);

        if (last == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }

        size++;
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
        if (first == null) {
            return null;
        }
        return first.value;
    }

    public T poll() {
        if (first == null) {
            return null;
        }

        T value = first.value;
        first = first.next;
        size--;

        if (first == null) {
            return null;
        }
        return value;
    }
}
