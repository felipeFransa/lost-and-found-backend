package br.com.felipe.main;

import br.com.felipe.model.NewPost;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class MainPost {

    private static final String PLAN_PLUS = "plus";
    private static final String PLAN_PREMIER = "premier";

    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        NewPost post = new NewPost();

        System.out.println("Register new post");
        System.out.println("Enter your type plan (plus/premier):");
        String typePlan = reading.nextLine().toLowerCase();

        switch (typePlan) {
            case PLAN_PLUS:
                handlePlusPlan(reading, post);
                break;
            case PLAN_PREMIER:
                handlePremierPlan();
                break;
            default:
                System.out.println("Access denied");
                break;
        }
    }

    private static void handlePlusPlan(Scanner reading, NewPost post) {
        System.out.println("New post finds");

        System.out.println("Enter your animal:");
        String animal = reading.nextLine();
        System.out.println("Enter your species:");
        String species = reading.nextLine();
        System.out.println("Enter your region:");
        String region = reading.nextLine();

        post.setAnimalsName(animal);
        post.setAnimalsType(species);
        post.setRegion(region);

        System.out.println("Animal Name: " + post.getAnimalsName());
        System.out.println("Animal Type: " + post.getAnimalsType());
        System.out.println("Region: " + post.getRegion());
    }

    private static void handlePremierPlan() {
        LocalDate nowDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now();

        System.out.println("Hello User!");
        System.out.println("Current Date: " + nowDate);
        System.out.println("Current Time: " + nowTime);
    }
}