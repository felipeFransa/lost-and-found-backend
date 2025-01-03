package br.com.felipe.main;

import br.com.felipe.model.UserManager;

import java.util.Scanner;

public class MainRegister {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        UserManager newUserManager = new UserManager();
        System.out.println("Register new user manager");
        System.out.println("Enter your name:");
        String managerName = reading.nextLine();

        System.out.println("Enter your region:");
        String managerRegion = reading.nextLine();

        System.out.println("Enter your age:");
        String managerAge = reading.nextLine();

        System.out.println("enter your password:");
        String password = reading.nextLine();

        newUserManager.setFirstName(managerName);
        newUserManager.setRegion(managerRegion);
        newUserManager.setAge(managerAge);
        newUserManager.setPassword(password);
        newUserManager.setToCheck(true);

        if (newUserManager.isToCheck()){
            System.out.println(newUserManager.getFirstName());
            System.out.println(newUserManager.getAge());
            System.out.println(newUserManager.getRegion());
        }else {
            System.out.println("failed");
        }
    }
}