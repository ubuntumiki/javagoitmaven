package core.com.module_09.hometask.task_01;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>();

        for (int i = 0; i < 13; i++) {
            arrayList.add("abc" + i);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("arrayList.get(" + i + ") = " + arrayList.get(i));
        }
//        arrayList.add("abc0");
//        arrayList.add("abc1");
//        arrayList.add("abc2");
//        arrayList.add("abc3");
//        arrayList.add("abc4");
//        arrayList.add("abc5");
//        arrayList.add("abc6");
//        arrayList.add("abc7");
//        arrayList.add("abc8");
//        arrayList.add("abc9");
//        arrayList.add("abc10");
//        arrayList.add("abc11");

        System.out.println("arrayList.get(0) = " + arrayList.get(0));
        System.out.println("arrayList.get(11) = " + arrayList.get(11));
//        System.out.println("arrayList.get(0) = " + arrayList.get(14));
        System.out.println("arrayList.size() = " + arrayList.size());

        arrayList.clear();
        System.out.println("arrayList.size() = " + arrayList.size());

        for (int i = 0; i < 12; i++) {
            System.out.print("--");
            arrayList.add("abc" + i);
        }
        System.out.println();
        System.out.println("arrayList.get(1) = " + arrayList.get(1));
        System.out.println("arrayList.size() = " + arrayList.size());
        System.out.println("arrayList.remove(1) = " + arrayList.remove(1));
        System.out.println("arrayList.get(1) = " + arrayList.get(1));
        System.out.println("arrayList.size() = " + arrayList.size());
    }
}
