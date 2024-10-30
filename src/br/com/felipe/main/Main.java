package br.com.felipe.main;

import br.com.felipe.model.UserManager;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        UserManager user = new UserManager();
        LocalDate myObj = LocalDate.now();
        LocalTime myTime = LocalTime.now();

        System.out.println("Enter your name:");
        String name = reading.nextLine();

        System.out.println("Enter your age:");
        String age = reading.nextLine();

        user.setFirstName(name);
        user.setAge(age);

        var userName = user.getFirstName();
        var userAge = user.getAge();

        if (userName.equals("felipe") || userAge.equals("27")){
            System.out.println("Welcome Client");
            System.out.println(myObj);
            System.out.println(myTime);
        }else {
            System.out.println("Welcome Manager");
        }
    }
}
