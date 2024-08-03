package br.com.felipe.main;

import br.com.felipe.model.UserClient;

import java.util.Scanner;

public class MainClient {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        UserClient client = new UserClient();

        System.out.println("Enter your name:");
        String clientName = reading.nextLine();

        System.out.println("Enter your city:");
        String clientCity = reading.nextLine();

        System.out.println("Enter your PhoneNumber");
        String clientPhoneNumber = reading.nextLine();

        System.out.println("Enter your password:");
        String clientPassword = reading.nextLine();

        boolean isClient = true;

        while (isClient){
            client.setCityName(clientCity);
            client.setPassword(clientPassword);
            client.setFirstName(clientName);
            client.setPhoneNumber(clientPhoneNumber);

            System.out.println(client.getCityName());
            System.out.println(client.getFirstName());
            System.out.println("**"+client.getPassword());
            System.out.println(client.getPhoneNumber());
            break;
        }
    }
}
