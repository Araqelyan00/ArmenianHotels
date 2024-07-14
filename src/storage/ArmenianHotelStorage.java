package storage;

import exception.HotelNotFoundException;
import model.ArmenianHotel;

public class ArmenianHotelStorage {

    private static ArmenianHotel[] armenianHotels = new ArmenianHotel[10];

    private static int size = 0;

    public static void add(ArmenianHotel armenianHotel) {
        if (armenianHotels.length == size) {
            extend();
        }
        armenianHotels[size++] = armenianHotel;
    }

    private static void extend() {
        ArmenianHotel[] temp = new ArmenianHotel[armenianHotels.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = armenianHotels[i];
        }
        armenianHotels = temp;
    }

    public void deleteHotelByName(String name) {
        for (int i = 0; i < armenianHotels.length; i++) {
            if (armenianHotels[i].getName().equals(name)) {
                armenianHotels[i] = null;
            }
        }
        System.out.println("Hotel deleted successfully");
    }

    public void printAllHotels() {
        for (int i = 0; i < armenianHotels.length; i++) {
            if (armenianHotels[i] != null) {
                System.out.println(armenianHotels[i].toString());
            }
        }
    }

    public void printHotelByName(String name) throws HotelNotFoundException {
        for (int i = 0; i < armenianHotels.length; i++) {
            if (!name.equals(armenianHotels[i].getName())) {
                throw new HotelNotFoundException("Hotel with name " + name + " not found");
            } else {
                System.out.println(armenianHotels[i].toString());
            }
        }
    }

    public void printHotelsByStarsCount(int starsCount) throws HotelNotFoundException {
        for (int i = 0; i < armenianHotels.length; i++) {
            if (!(armenianHotels[i].getStars() == starsCount)) {
                throw new HotelNotFoundException("Hotel with " + starsCount + " stars not found");
            } else {
                System.out.println(armenianHotels[i].toString());
            }
        }
    }

    public void printHotelByAddress(String address) throws HotelNotFoundException {
        for (int i = 0; i < armenianHotels.length; i++) {
            if (!(address.equals(armenianHotels[i].getName()))) {
                throw new HotelNotFoundException("Hotel with address " + address + " not found");
            } else if (address.equals(armenianHotels[i].getAddress())) {
                System.out.println(armenianHotels[i].toString());
            }
        }
    }
}
