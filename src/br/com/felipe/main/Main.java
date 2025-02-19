package br.com.felipe.main;

import br.com.felipe.model.UserClient;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        UserClient user = new UserClient();
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Solicitar informações do usuário
        System.out.println("Enter your name:");
        String name = reading.nextLine().trim();
        while (name.isEmpty()) {
            System.out.println("Name cannot be empty. Please enter your name:");
            name = reading.nextLine().trim();
        }

        System.out.println("Enter your age:");
        int age = -1;
        while (age < 0) {
            try {
                age = reading.nextInt();
                if (age < 0) {
                    System.out.println("Age cannot be negative. Please enter a valid age:");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid age:");
                reading.nextLine(); // Limpar o buffer do scanner
                age = -1;
            }
        }
        reading.nextLine(); // Consumir a nova linha pendente

        // Definir as informações do usuário
        user.setFirstName(name);
        user.setAge(age);

        // Verificar acesso
        if (name.equalsIgnoreCase("felipe") || age == 27) {
            System.out.println("\n--- Access Granted ---");
            System.out.println("Welcome, " + user.getFirstName() + "!");
            System.out.println("Date: " + currentDate.format(dateFormatter));
            System.out.println("Time: " + currentTime.format(timeFormatter));
        } else {
            System.out.println("\n--- Access Denied ---");
            System.out.println("Sorry, " + user.getFirstName() + ", you do not have access.");
        }
    }
}