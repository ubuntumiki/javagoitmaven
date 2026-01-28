package core.com.module_09.hometask.task_04;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();

        for (int i = 10; i < 18; i++) {
            myStack.push(i);
        }

        System.out.println("myStack.size() = " + myStack.size());

        System.out.println("myStack.remove(5) = " + myStack.remove(5));
        System.out.println("myStack.size() = " + myStack.size());

        System.out.println("myStack.peek() = " + myStack.peek());

        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.size() = " + myStack.size());


        myStack.clear();
        System.out.println("myStack.size() = " + myStack.size());
    }
}
