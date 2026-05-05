package com.projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Username: " + username + ", Email: " + email;
    }
}

public class UserRegisterSystem {

    static List<User> users = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== User Registration System ===");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Update Username");
            System.out.println("4. Delete User");
            System.out.println("5. Show All Users");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> registerUser();
                case 2 -> loginUser();
                case 3 -> updateUsername();
                case 4 -> deleteUser();
                case 5 -> showUsers();
                case 6 -> {
                    System.out.println("Exiting system...");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    static void registerUser() {
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        if (isUsernameExists(username)) {
            System.out.println("Username already exists!");
            return;
        }

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();
       

        users.add(new User(username, password, email));
        System.out.println("User registered successfully!");
    }

    static void loginUser() {
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        for (User u : users) {
            if (u.username.equalsIgnoreCase(username) && u.password.equals(password)) {
                System.out.println("Login successful! Welcome, " + username);
                return;
            }
        }
        System.out.println("Invalid username or password!");
    }

    static void updateUsername() {
        System.out.print("Enter current username: ");
        String oldUsername = sc.nextLine();

        User user = getUserByUsername(oldUsername);
        if (user == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.print("Enter new username: ");
        String newUsername = sc.nextLine();

        if (isUsernameExists(newUsername)) {
            System.out.println("Username already exists!");
        } else {
            user.username = newUsername;
            System.out.println("Username updated successfully!");
        }
    }

    static void deleteUser() {
        System.out.print("Enter username to delete: ");
        String username = sc.nextLine();

        User user = getUserByUsername(username);
        if (user != null) {
            users.remove(user);
            System.out.println("User deleted successfully!");
        } else {
            System.out.println("User not found!");
        }
    }

    static void showUsers() {
        if (users.isEmpty()) {
            System.out.println("No registered users.");
            return;
        }
        System.out.println("\n--- Registered Users ---");
        for (User u : users) {
            System.out.println(u);
        }
    }

    static boolean isUsernameExists(String username) {
        for (User u : users) {
            if (u.username.equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }

    static User getUserByUsername(String username) {
        for (User u : users) {
            if (u.username.equalsIgnoreCase(username)) {
                return u;
            }
        }
        return null;
    }
}
