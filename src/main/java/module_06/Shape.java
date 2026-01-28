package core.com.module_06;

class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
        System.out.println("Call in Shape");
    }
}

class Circle extends Shape {
    private float radius;

    public Circle(float radius) {
        super("Circle"); //Найперша інструкція
        this.radius = radius;

        System.out.println("Call in Circle");
    }
}

class Launcher {
    public static void main(String[] args) {
        new Circle(3.2f);
    }
}
