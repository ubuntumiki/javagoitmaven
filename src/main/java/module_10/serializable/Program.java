package core.com.module_10.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Program {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/core/com/module_10/serializable/person.dat"))) {
            Person2 person = new Person2("Miki", 45, 1.75, true);
            oos.writeObject(person);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/core/com/module_10/serializable/person.dat"))) {
            Person2 p = (Person2) ois.readObject();
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
