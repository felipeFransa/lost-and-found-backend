package br.com.felipe.main;

import br.com.felipe.model.UserClient;

import java.util.Scanner;

public class MainRegisterClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Register new client");

        UserClient client = new UserClient();

        System.out.println("Enter your name:");
        String clientName = scanner.nextLine();

        System.out.println("Enter your city:");
        String clientCity = scanner.nextLine();

        System.out.println("Enter your Phone Number:");
        String clientPhoneNumber = scanner.nextLine();

        System.out.println("Enter your password:");
        String clientPassword = scanner.nextLine();

        System.out.println("Enter your type plan (plus/regular):");
        String clientPlanType = scanner.nextLine();

        System.out.println("Enter your age:");
        int clientAge = 0;
        while (clientAge <= 0) {
            try {
                clientAge = Integer.parseInt(scanner.nextLine());
                if (clientAge <= 0) {
                    System.out.println("Please enter a valid age (positive number):");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid age (positive number):");
            }
        }

        if (clientPlanType.equalsIgnoreCase("plus")) {
            client.setCityName(clientCity);
            client.setPassword(clientPassword);
            client.setFirstName(clientName);
            client.setPhoneNumber(clientPhoneNumber);
            client.setAge(clientAge);

            if (client.getFirstName().equalsIgnoreCase("felipe")) {
                System.out.println("City: " + client.getCityName());
                System.out.println("Name: " + client.getFirstName());
                System.out.println("Password: **" + client.getPassword());
                System.out.println("Phone Number: " + client.getPhoneNumber());
                System.out.println("Age: " + client.getAge());
            }
        } else {
            System.out.println("You are not a plus client.");
        }

        scanner.close();
    }
}