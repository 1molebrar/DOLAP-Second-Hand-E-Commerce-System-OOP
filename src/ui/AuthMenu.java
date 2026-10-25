package ui;

import java.util.Scanner;
import service.AuthService;
import model.users.Buyer;
import model.users.Seller;
import model.users.User;

public class AuthMenu {

    public static User login(Scanner sc) {
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();

        User user = AuthService.login(username, password);
        if (user == null) {
            System.out.println("Login failed.");
        } else {
            System.out.println("Login successful.");
        }
        return user;
    }

    public static void register(Scanner sc) {
        String username;
        while (true) {
            System.out.print("Username: ");
            username = sc.nextLine().trim();
            if (username.isEmpty()) {
                System.out.println("Username cannot be empty. Please try again.");
                continue;
            }
            if (AuthService.isUsernameTaken(username)) {
                System.out.println("Username already exists. Please choose another one.");
                continue;
            }
            break;
        }
        
        String password;
        while (true) {
            System.out.print("Password: ");
            password = sc.nextLine().trim();
            if (password.isEmpty()) {
                System.out.println("Password cannot be empty. Please try again.");
                continue;
            }
            break;
        }

        System.out.println("1. Buyer");
        System.out.println("2. Seller");
        System.out.print("Select: ");

        int role = MenuUtil.getChoice(sc, 1, 2);

        boolean success;
        if (role == 1) {
            success = AuthService.register(new Buyer(username, password));
        } else {
            success = AuthService.register(new Seller(username, password));
        }

        if (success) {
            System.out.println("Registration successful.");
        } else {
            System.out.println("Registration failed. Please try again.");
        }
    }
}

