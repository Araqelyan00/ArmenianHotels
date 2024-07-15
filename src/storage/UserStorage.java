package storage;

import exception.HotelNotFoundException;
import exception.UserNotFoundException;
import model.ArmenianHotel;
import model.User;

public class UserStorage {

    private static User[] users = new User[100];

    private static int size = 0;

    public static void add(User user) {
        if (users.length == size) {
            extend();
        }
        users[size++] = user;
    }

    private static void extend() {
        User[] temp = new User[users.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = users[i];
        }
        users = temp;
    }

    public int findUser(String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void deleteUserByName(String name) throws UserNotFoundException {
        int user = findUser(name);
        if (user != -1) {
            users[user] = null;
            size--;
            System.out.println("Hotel deleted successfully");
        } else {
            throw new UserNotFoundException("User not found!");
        }
    }
}
