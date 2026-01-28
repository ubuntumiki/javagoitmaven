package core.com.module_09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTests {
    public static void main(String[] args) {

        String text = "Igor Matvienko\nIgor Petrenko\nBill Gates";

        Set<String> uniqueNames = new HashSet<>();

        String[] fullNames = text.split("\n");
        System.out.println(Arrays.toString(fullNames));

        for (String fullName : fullNames) {
            String[] nameParts = fullName.split(" ");
            System.out.println(Arrays.toString(nameParts));
            String firstName = nameParts[0];
            System.out.println(firstName);
            uniqueNames.add(firstName);
            System.out.println(uniqueNames);
        }

        System.out.println(uniqueNames);
    }
}
