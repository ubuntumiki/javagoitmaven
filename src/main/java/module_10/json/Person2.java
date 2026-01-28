package core.com.module_10.json;

class Person2 {
    private String name;
    private int age;
    private boolean married;
    private double height;

    public Person2(String name, int age, boolean married, double height) {
        this.name = name;
        this.age = age;
        this.married = married;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }

    public double getHeight() {
        return height;
    }
}
