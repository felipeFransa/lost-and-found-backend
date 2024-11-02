package br.com.felipe.main;

import br.com.felipe.model.UserClient;

import java.util.Scanner;

public class MainRegisterClient {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        Scanner readingNumber = new Scanner(System.in);
        System.out.println("register new client");
        UserClient client = new UserClient();

        System.out.println("Enter your name:");
        String clientName = reading.nextLine();

        System.out.println("Enter your city:");
        String clientCity = reading.nextLine();

        System.out.println("Enter your PhoneNumber");
        String clientPhoneNumber = reading.nextLine();

        System.out.println("Enter your password:");
        String clientPassword = reading.nextLine();

        System.out.println("Enter your type plan:");
        String isClient = reading.nextLine();

        System.out.println("Enter your age:");
        Integer clientAge = readingNumber.nextInt();

        if (isClient.equals("plus")){
            client.setCityName(clientCity);
            client.setPassword(clientPassword);
            client.setFirstName(clientName);
            client.setPhoneNumber(clientPhoneNumber);
            client.setAge(clientAge);

            System.out.println(client.getCityName());
            System.out.println(client.getFirstName());
            System.out.println("**"+client.getPassword());
            System.out.println(client.getPhoneNumber());
            System.out.println(client.getAge());
        }else {
            System.out.println("your not client plus");
        }
    }
}
