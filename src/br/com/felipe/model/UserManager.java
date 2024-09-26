package br.com.felipe.model;

import java.util.ArrayList;

public class UserManager {
    private String firstName;
    private String age;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private ArrayList<String> clients;
    private String region;
    private boolean toCheck;

    public boolean isToCheck() {
        return toCheck;
    }

    public void setToCheck(boolean toCheck) {
        this.toCheck = toCheck;
    }

    public ArrayList<String> getClients() {
        return clients;
    }

    public void setClients(ArrayList<String> clients) {
        this.clients = clients;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
