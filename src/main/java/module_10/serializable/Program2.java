package core.com.module_10.serializable;

import java.io.*;
import java.util.ArrayList;

public class Program2 {

    public static void main(String[] args) {

        String filename = "src/core/com/module_10/serializable/people.dat";

        // створимо список об'єктів, які будемо записувати
        ArrayList<Person2> people = new ArrayList<Person2>();
        people.add(new Person2("Tom", 30, 175, false));
        people.add(new Person2("Sam", 33, 178, true));

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(people);
            System.out.println("File has been written");
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        // десеріалізація у новий список
        ArrayList<Person2> newPeople = new ArrayList<Person2>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            newPeople = (ArrayList<Person2>) ois.readObject();
        } catch(Exception ex) {
            ex.printStackTrace();
        }

        for(Person2 p : newPeople) {
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
        }
    }
}

class Person2 implements Serializable{
    private String name;
    private int age;
    private transient double height;
    private transient boolean married;

    Person2(String name, int age, double height, boolean married){
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getName() {
        return name;
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

