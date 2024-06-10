package br.com.felipe.main;

import br.com.felipe.model.UserManager;

public class MainManager {
    public static void main(String[] args) {
        UserManager manager = new UserManager();
        manager.setFirstName("Silva");
        manager.setRegion("Suldeste");
        manager.setAge(28);
        manager.setPassword(8150);

        System.out.println(manager.getFirstName());
        System.out.println(manager.getRegion());
        System.out.println(manager.getAge());
        System.out.println(manager.getPassword());
    }
}