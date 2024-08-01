package br.com.felipe.main;

import br.com.felipe.model.UserManager;

import java.util.Scanner;

public class MainManager {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        System.out.println("Enter your name:");
        String managerName = reading.nextLine();

        System.out.println("Enter your region:");
        String managerRegion = reading.nextLine();

        System.out.println("Enter your age:");
        Integer managerAge = reading.nextInt();

        UserManager manager = new UserManager();
        manager.setFirstName(managerName);
        manager.setRegion(managerRegion);
        manager.setAge(managerAge);
        manager.setPassword(8150);

        while (true){
            System.out.println(manager.getFirstName());
            System.out.println(manager.getRegion());
            System.out.println(manager.getAge());
            System.out.println(manager.getPassword());
            break;
        }

    }
}