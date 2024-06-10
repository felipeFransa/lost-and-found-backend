package br.com.felipe.main;

import br.com.felipe.model.UserClient;

public class MainClient {
    public static void main(String[] args) {

        UserClient client = new UserClient();

        client.setCityName("Belo Horinzote");
        client.setPassword(1997);
        client.setFirstName("Fransa");
        client.setPhoneNumber(31971);

        System.out.println(client.getCityName());
        System.out.println(client.getFirstName());
        System.out.println(client.getPassword());
        System.out.println(client.getPhoneNumber());
    }
}
