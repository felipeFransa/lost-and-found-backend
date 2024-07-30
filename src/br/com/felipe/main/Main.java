package br.com.felipe.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Enter 0 of Client or 1 Manager");
        Integer option = reading.nextInt();

        if (option > 0){
            System.out.println("Welcome Client");
        }else {
            System.out.println("Welcome Manager");
        }
    }
}
