package service;

import java.util.ArrayList;
import java.util.List;
import model.users.User;

public class AuthService {

    private static final List<User> users = new ArrayList<>();

    public static boolean register(User user) {
        // Check for duplicate username
        for (User existingUser : users) {
            if (existingUser.getUsername().equals(user.getUsername())) {
                return false; // Username already exists
            }
        }
        users.add(user);
        return true; // Registration successful
    }
    
    public static boolean isUsernameTaken(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public static User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)
                    && user.checkPassword(password)) {
                return user;
            }
        }
        return null;
    }
}

