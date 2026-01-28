package core.com.module_10.json;

import com.google.gson.Gson;

public class GsonTest2 {
    public static void main(String[] args) {
        String json = "{\n" +
                "  \"name\": \"Bill\",\n" +
                "  \"age\": 30,\n" +
                "  \"married\": true,\n" +
                "  \"height\": 1.78\n" +
                "}";

        Person2 person = new Gson().fromJson(json, Person2.class);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.isMarried());
        System.out.println(person.getHeight());
    }
}
