package br.com.felipe.main;

import br.com.felipe.model.User;

public class Main {
    public static void main(String[] args) {

        User newUser = new User();

        newUser.setFirstName("Felipe");
        newUser.setAge(17);
        newUser.setPassword(1997);

        var age = newUser.getAge();
        var name = newUser.getFirstName();

        if (age >= 18){
            System.out.println("Olá " +name + " Acesso permitido.");
        }else {
            System.out.println("Acesso negado.");
        }
    }
}
