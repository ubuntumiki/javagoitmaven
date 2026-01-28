package core.com.module_10.hometask.task_02;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<User> users;
        try (FileInputStream fileInputStream = new FileInputStream("src/core/com/module_10/hometask/task_02/file.txt")) {

            users = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8))) {
                reader.readLine();

                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("\\s+");

                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);

                    users.add(new User(name, age));
                }
            }
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("src/core/com/module_10/hometask/task_02/user.json")) {
            gson.toJson(users, writer);
        }

    }
}
