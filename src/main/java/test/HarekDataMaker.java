package test;

import java.util.Arrays;

public class HarekDataMaker {
    public String aggregateSingle(String name, int age, String planet) {
        return "name - " + name + ", age - " + age + ", planet - " + planet;
    }

    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {
        // довжина кожного масиву гарантовано 3
        return new String[] {
                aggregateSingle(names[0], ages[0], planets[0]),
                aggregateSingle(names[1], ages[1], planets[1]),
                aggregateSingle(names[2], ages[2], planets[2])
        };
    }

    public static void main(String[] args) {
        String[] names = new String[] {"hter", "pou", "diz"};
        int[] ages = new int[] {30, 35, 70};
        String[] planets = new String[] {"Mars", "Earth", "Jupiter"};

        HarekDataMaker harekDataMaker = new HarekDataMaker();

        System.out.println(harekDataMaker.aggregateSingle(names[0], ages[0], planets[0]));
        System.out.println("###");

        System.out.println(Arrays.toString(harekDataMaker.aggregateAll(names, ages, planets)));
    }
}
