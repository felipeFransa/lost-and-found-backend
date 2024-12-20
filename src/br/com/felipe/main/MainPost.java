package br.com.felipe.main;

import br.com.felipe.model.NewPost;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class MainPost {

    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        NewPost post = new NewPost();
        LocalDate nowDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now();

        System.out.println("register new post");
        System.out.println("enter your type plan");
        String typePlan = reading.nextLine();

        if (typePlan.equals("plus")){
            System.out.println("new post finds");

            System.out.println("enter your animal:");
            String animal = reading.nextLine();
            System.out.println("Enter your species:");
            String species = reading.nextLine();
            System.out.println("Enter your region");
            String region = reading.nextLine();

            post.setAnimalsName(animal);
            post.setAnimalsType(species);
            post.setRegion(region);

            System.out.println(post.getAnimalsName());
            System.out.println(post.getAnimalsType());
            System.out.println(post.getRegion());

        } else if (typePlan.equals("premier")) {
            System.out.println("Hello User!");
            System.out.println(nowDate);
            System.out.println(nowTime);
        } else {
            System.out.println("Access denied");
        }
    }
}
