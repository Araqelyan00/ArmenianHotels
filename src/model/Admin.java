package model;

public class Admin {
    private String username = "1234";
    private String password = "1234";

    public Admin() {

    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}