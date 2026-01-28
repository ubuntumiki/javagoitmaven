package core.com.module_09.hometask.task_02;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        System.out.println("list.size() = " + list.size());
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("list.get(2) = " + list.get(2));

        System.out.println("list.size() = " + list.size());
        System.out.println("list.remove(1) = " + list.remove(1));
        System.out.println("list.size() = " + list.size());

        for (int i = 0; i < 15; i++) {
            System.out.print("--");
        }
        System.out.println();

        list.clear();
        System.out.println("list.size() = " + list.size());
    }
}
