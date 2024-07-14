package model;

public class User {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String phoneNumber;
    private boolean haveReservedRoom;

    public User(String name, String surname, int age, String email, String phoneNumber, boolean haveReservedRoom) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.haveReservedRoom = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isHaveReservedRoom() {
        return haveReservedRoom;
    }

    public void setHaveReservedRoom(boolean haveReservedRoom) {
        this.haveReservedRoom = haveReservedRoom;
    }
}
