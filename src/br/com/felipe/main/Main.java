package br.com.felipe.main;

import br.com.felipe.model.NewPost;
import br.com.felipe.model.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        User newUser = new User();
        NewPost post = new NewPost();

        System.out.println("Digite seu animal:");
        String animal = reading.nextLine();

        post.setAnimalsName(animal);
        post.setAnimalsType("Felinos");

        newUser.setFirstName("Felipe");
        newUser.setAge(18);
        newUser.setPassword(1997);

        var age = newUser.getAge();
        var name = newUser.getFirstName();

        if (age >= 18){
            System.out.println("Olá " +name + " Acesso permitido.");
            System.out.println(post.getAnimalsName());
        }else {
            System.out.println("Acesso negado.");
        }
    }
}
