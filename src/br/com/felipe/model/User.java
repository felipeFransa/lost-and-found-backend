package br.com.felipe.model;
public class User {
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

    public void user(){
        System.out.println("Seja bem vindo " +getFirstName());
        System.out.println("Sua idade é: " +getAge());
    }
}
