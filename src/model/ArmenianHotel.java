package model;

public class ArmenianHotel {
    private String name;
    private String address;
    private String phone;
    private String email;
    private Room rooms;
    private int stars;

    public ArmenianHotel(String name, String address, String phone, String email, Room rooms, int stars) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.rooms = rooms;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Room getRooms() {
        return rooms;
    }

    public void setRooms(Room rooms) {
        this.rooms = rooms;
    }



}
