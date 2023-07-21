package pl.coderslab.entity;

import java.util.Scanner;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        Scanner scanner = new Scanner(System.in);
        String operation;

        do {
            System.out.println("Select an operation:");
            System.out.println("1. Create user");
            System.out.println("2. Read user");
            System.out.println("3. Update user");
            System.out.println("4. Delete user");
            System.out.println("5. Find all users");
            System.out.println("Type 'exit' to quit");

            operation = scanner.nextLine();

            switch (operation) {
                case "1":
                    User newUser = new User();
                    System.out.println("Enter username:");
                    newUser.setUserName(scanner.nextLine());
                    System.out.println("Enter email:");
                    newUser.setEmail(scanner.nextLine());
                    System.out.println("Enter password:");
                    newUser.setPassword(scanner.nextLine());
                    userDao.create(newUser);
                    System.out.println("User created with ID: " + newUser.getId());
                    break;
                case "2":
                    System.out.println("Enter user ID:");
                    int userId = scanner.nextInt();
                    User user = userDao.read(userId);
                    if (user != null) {
                        System.out.println("User found:");
                        System.out.println("ID: " + user.getId());
                        System.out.println("Username: " + user.getUserName());
                        System.out.println("Email: " + user.getEmail());
                        System.out.println("Password: " + user.getPassword());
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case "3":
                    System.out.println("Enter user ID:");
                    int updateUserId = scanner.nextInt();
                    scanner.nextLine();
                    User updateUser = userDao.read(updateUserId);
                    if (updateUser != null) {
                        System.out.println("Enter new username:");
                        updateUser.setUserName(scanner.nextLine());
                        System.out.println("Enter new email:");
                        updateUser.setEmail(scanner.nextLine());
                        System.out.println("Enter new password:");
                        updateUser.setPassword(scanner.nextLine());
                        userDao.update(updateUser);
                        System.out.println("User updated successfully.");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case "4":
                    System.out.println("Enter user ID:");
                    int deleteUserId = scanner.nextInt();
                    scanner.nextLine();
                    userDao.delete(deleteUserId);
                    System.out.println("User deleted successfully.");
                    break;
                case "5":
                    User[] allUsers = userDao.findAll();
                    if (allUsers.length > 0) {
                        System.out.println("All users:");
                        for (User u : allUsers) {
                            System.out.println("ID: " + u.getId());
                            System.out.println("Username: " + u.getUserName());
                            System.out.println("Email: " + u.getEmail());
                            System.out.println("Password: " + u.getPassword());
                            System.out.println("--------------------");
                        }
                    } else {
                        System.out.println("No users found.");
                    }
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        } while (!operation.equalsIgnoreCase("exit"));

        scanner.close();
    }
}
