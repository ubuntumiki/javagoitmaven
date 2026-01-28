package core.com.module_09.hometask.task_03;

public class Main {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();

        myQueue.add("a");
        myQueue.add("b");
        myQueue.add("c");
        myQueue.add("d");
        myQueue.add("e");
        System.out.println("myQueue.size() = " + myQueue.size());

        System.out.println("myQueue.peek() = " + myQueue.peek());

        System.out.println("------------------------------------");
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.peek() = " + myQueue.peek());

        myQueue.clear();
        System.out.println("myQueue.size() = " + myQueue.size());

    }
}
