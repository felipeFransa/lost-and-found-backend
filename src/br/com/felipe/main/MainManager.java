package br.com.felipe.main;

import br.com.felipe.model.UserManager;

import java.util.Scanner;

public class MainManager {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        String userValid = reading.nextLine();

        if (userValid.equals("usermanager")){
            UserManager manager = new UserManager();

            System.out.println("Enter your name:");
            String managerName = reading.nextLine();

            System.out.println("Enter your region:");
            String managerRegion = reading.nextLine();

            System.out.println("Enter your age:");
            String managerAge = reading.nextLine();

            System.out.println("enter your password:");
            String password = reading.nextLine();

            manager.setFirstName(managerName);
            manager.setRegion(managerRegion);
            manager.setAge(managerAge);
            manager.setPassword(password);

            while (true){
                System.out.println(manager.getFirstName());
                System.out.println(manager.getRegion());
                System.out.println(manager.getAge());
                System.out.println(manager.getPassword());
                break;
            }
        }
    }
}