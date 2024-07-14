package storage;

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

    public void deleteUserByName(String name) throws UserNotFoundException {
        for (int i = 0; i < size; i++) {
            if (users[i].getName().equals(name)) {
                users[i] = null;
                size--;
            }
        }
    }
}
