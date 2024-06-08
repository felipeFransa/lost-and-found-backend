package br.com.felipe.main;

import br.com.felipe.model.NewPost;
import br.com.felipe.model.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User newUser = new User();
        newUser.setFirstName("Felipe Francie");
        newUser.setAge(18);
        newUser.setPassword(1997);

        var age = newUser.getAge();
        var name = newUser.getFirstName();

        if (age >= 18){
            System.out.println("Hi " +name + "access allowed.");

        }else {
            System.out.println("Access denied.");
        }
    }
}
