package core.com.module_09.hometask.task_05;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("apple", 25);
        myHashMap.put("banana", 75);
        myHashMap.put("cherry", 1800);
        myHashMap.put("kiwi", 80);
        myHashMap.put("orange", 50);
        System.out.println("myHashMap.size() = " + myHashMap.size());

        myHashMap.remove("kiwi");
        System.out.println("myHashMap.size() = " + myHashMap.size());

        System.out.println("myHashMap.get(\"kiwi\") = " + myHashMap.get("kiwi"));
        System.out.println("myHashMap.get(\"apple\") = " + myHashMap.get("apple"));


        myHashMap.clear();
        System.out.println("myHashMap.size() = " + myHashMap.size());
    }
}
