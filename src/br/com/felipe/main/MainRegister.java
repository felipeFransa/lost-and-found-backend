package br.com.felipe.main;

import br.com.felipe.model.UserManager;

import java.util.Scanner;

public class MainRegister {

    private static final String ENTER_YOUR_NAME = "Enter your name:";
    private static final String ENTER_YOUR_REGION = "Enter your region:";
    private static final String ENTER_YOUR_AGE = "Enter your age:";
    private static final String ENTER_YOUR_PASSWORD = "Enter your password:";
    private static final String REGISTRATION_SUCCESSFUL = "Registration Successful!";
    private static final String REGISTRATION_FAILED = "Registration Failed!";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager();

        System.out.println("Register new user manager");

        String managerName = getValidatedInput(scanner, ENTER_YOUR_NAME, "Name");
        String managerRegion = getValidatedInput(scanner, ENTER_YOUR_REGION, "Region");
        String managerAge = getValidatedAge(scanner, ENTER_YOUR_AGE, "Age");
        String password = getValidatedInput(scanner, ENTER_YOUR_PASSWORD, "Password");

        userManager.setFirstName(managerName);
        userManager.setRegion(managerRegion);
        userManager.setAge(managerAge);
        userManager.setPassword(password);
        userManager.setToCheck(true);

        if (userManager.isToCheck()) {
            displayUserDetails(userManager);
            System.out.println(REGISTRATION_SUCCESSFUL);
        } else {
            System.out.println(REGISTRATION_FAILED);
        }

        scanner.close();
    }

    private static String getValidatedInput(Scanner scanner, String prompt, String fieldName) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();
            if (input == null || input.trim().isEmpty()) {
                System.out.println(fieldName + " cannot be empty. Please try again.");
            } else {
                return input;
            }
        }
    }

    private static String getValidatedAge(Scanner scanner, String prompt, String fieldName) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();
            if (input == null || input.trim().isEmpty()) {
                System.out.println(fieldName + " cannot be empty. Please try again.");
            } else {
                try {
                    int age = Integer.parseInt(input);
                    if (age <= 0) {
                        System.out.println(fieldName + " must be a positive number. Please try again.");
                    } else {
                        return input;
                    }
                } catch (NumberFormatException e) {
                    System.out.println(fieldName + " must be a valid number. Please try again.");
                }
            }
        }
    }

    private static void displayUserDetails(UserManager userManager) {
        System.out.println("User Details:");
        System.out.println("Name: " + userManager.getFirstName());
        System.out.println("Age: " + userManager.getAge());
        System.out.println("Region: " + userManager.getRegion());
        System.out.println("Password: " + userManager.getPassword());
    }
}