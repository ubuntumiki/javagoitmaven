package core.com.module_09.hometask.task_04;

public class StackNode<T> {
    T value;
    StackNode<T> prev;
    StackNode<T> next;

    public StackNode(T value) {
        this.value = value;
    }
}
