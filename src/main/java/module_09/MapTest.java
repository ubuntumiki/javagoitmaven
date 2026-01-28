package core.com.module_09;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("Java", 5000);
        salaries.put("Frontend", 2000);

        System.out.println("All professions:");
        for (String profession : salaries.keySet()) {
            System.out.println(profession);
        }

        System.out.println("\nAll salaries:");
        for (int salary : salaries.values()) {
            System.out.println(salary);
        }

        System.out.println("\nJava salary is " + salaries.get("Java"));
    }
}
