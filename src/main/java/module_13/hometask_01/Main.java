package module_13.hometask_01;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        JsonPlaceholderUsersClient client = new JsonPlaceholderUsersClient();

        List<User> all = client.getAllUsers();
        System.out.println("Users count: " + all.size());

        User u1 = client.getUserById(1);
        System.out.println("User #1: " + u1.username + " / " + u1.email);

        List<User> byUsername = client.getUsersByUsername("Bret");
        System.out.println("By username Bret: " + byUsername.size());

        User newUser = new User();
        newUser.name = "Test Name";
        newUser.username = "test_username";
        newUser.email = "test@mail.com";

        User created = client.createUser(newUser);
        System.out.println("Created id: " + created.id);

        int idToUpdate = 1;
        created.id = idToUpdate;
        created.email = "new@mail.com";

        User updated = client.updateUser(idToUpdate, created);
        System.out.println("Updated email: " + updated.email);
        System.out.println();

        boolean deleted = client.deleteUser(1);
        System.out.println("Deleted status (id=1): " + deleted);
        System.out.println();

        String file = client.saveCommentLastPost(1);
        System.out.println("Saved to: " + file);
        System.out.println();

        client.printOpenTodos(1);
    }
}
