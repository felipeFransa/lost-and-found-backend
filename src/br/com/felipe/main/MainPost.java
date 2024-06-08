package br.com.felipe.main;

import br.com.felipe.model.NewPost;

import java.util.Scanner;

public class MainPost {

    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        NewPost post = new NewPost();
        System.out.println("enter your animal:");
        String animal = reading.nextLine();

        post.setAnimalsName(animal);
        post.setAnimalsType("Feline");

        System.out.println(post.getAnimalsName());
        System.out.println(post.getAnimalsType());
    }
}
