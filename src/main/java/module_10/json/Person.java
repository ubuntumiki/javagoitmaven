package core.com.module_10.json;

public class Person {
    private String nama;
    private int age;
    private double height;
    private boolean married;

    public Person(String nama, int age, double height, boolean married) {
        this.nama = nama;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getNama() {
        return nama;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarried() {
        return married;
    }
}
