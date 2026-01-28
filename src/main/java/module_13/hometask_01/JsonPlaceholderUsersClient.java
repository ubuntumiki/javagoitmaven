package module_13.hometask_01;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class JsonPlaceholderUsersClient {
    private static final String BASE = "https://jsonplaceholder.typicode.com";
    private final HttpClient http = HttpClient.newHttpClient();
    private final ObjectMapper mapper = new ObjectMapper();

    // 1) Створення нового користувача (POST /users)
    public User createUser(User user) throws IOException, InterruptedException {
        String json = mapper.writeValueAsString(user);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE + "/users"))
                .header("Content-Type", "application/json; charset=UTF-8")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

        HttpResponse<String> resp = http.send(request, HttpResponse.BodyHandlers.ofString());
        ensure2xx(resp);

        return mapper.readValue(resp.body(), User.class);
    }

    // 2) Оновлення користувача (PUT /users/{id})
    public User updateUser(int id, User user) throws IOException, InterruptedException {
        String json = mapper.writeValueAsString(user);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE + "/users/" + id))
                .header("Content-Type", "application/json; charset=UTF-8")
                .PUT(HttpRequest.BodyPublishers.ofString(json))
                .build();

        HttpResponse<String> resp = http.send(request, HttpResponse.BodyHandlers.ofString());
        ensure2xx(resp);

        return mapper.readValue(resp.body(), User.class);
    }

    // 3) Видалення користувача (DELETE /users/{id}) -> true якщо 2xx
    public boolean deleteUser(int id) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE + "/users/" + id))
                .DELETE()
                .build();

        HttpResponse<String> resp = http.send(request, HttpResponse.BodyHandlers.ofString());
        return resp.statusCode() / 100 == 2;
    }

    // 4) Отримати всіх користувачів (GET /users)
    public List<User> getAllUsers() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE + "/users"))
                .GET()
                .build();

        HttpResponse<String> resp = http.send(request, HttpResponse.BodyHandlers.ofString());
        ensure2xx(resp);

        return mapper.readValue(resp.body(), new TypeReference<List<User>>() {});
    }

    // 5) Отримати користувача за id (GET /users/{id})
    public User getUserById(int id) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE + "/users/" + id))
                .GET()
                .build();

        HttpResponse<String> resp = http.send(request, HttpResponse.BodyHandlers.ofString());
        ensure2xx(resp);

        return mapper.readValue(resp.body(), User.class);
    }

    // 6) Отримати користувача(ів) за username (GET /users?username=...)
    public List<User> getUsersByUsername(String username) throws IOException, InterruptedException {
        String encoded = URLEncoder.encode(username, StandardCharsets.UTF_8);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE + "/users?username=" + encoded))
                .GET()
                .build();

        HttpResponse<String> resp = http.send(request, HttpResponse.BodyHandlers.ofString());
        ensure2xx(resp);

        return mapper.readValue(resp.body(), new TypeReference<List<User>>() {});
    }

    private static void ensure2xx(HttpResponse<?> resp) {
        if (resp.statusCode() / 100 != 2) {
            throw new RuntimeException("HTTP " + resp.statusCode() + ": " + resp.body());
        }
    }
}
