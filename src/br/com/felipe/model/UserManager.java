package br.com.felipe.model;

import java.util.ArrayList;

public class UserManager extends User {

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
