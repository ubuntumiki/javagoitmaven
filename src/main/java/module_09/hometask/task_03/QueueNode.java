package core.com.module_09.hometask.task_03;

public class QueueNode<T> {
    T value;
    QueueNode<T> next;

    public QueueNode(T value) {
        this.value = value;
    }
}
