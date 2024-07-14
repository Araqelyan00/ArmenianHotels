package storage;

import model.ArmenianHotel;
import model.Room;
import model.RoomTypes;
import model.User;

public class RoomStorage {

    private static final Room[] rooms = new Room[10];


    public void printRoomTypes() {
        for (RoomTypes type : RoomTypes.values()) {
            System.out.println(type.name());
        }
    }

    public void printAvailableRoomsByType(ArmenianHotel hotel, RoomTypes type) {
        for (Room room : rooms) {
            if (hotel.getRooms().getType() == type && !hotel.getRooms().isReserved()) {
                System.out.println(room.getNumber());
            }
        }
    }

    public void reserveRoom(Room room, User user) {
        if (!room.isReserved()) {
            room.setReserved(true);
            user.setHaveReservedRoom(true);
            System.out.println("Room " + room.getNumber() + " reserved successfully");
        } else {
            room.setReserved(false);
            user.setHaveReservedRoom(false);
            System.out.println("You can't reserve room " + room.getNumber());
        }
    }

    public void releaseRoom(Room room, User user) {
        if (room.isReserved()) {
            room.setReserved(false);
            user.setHaveReservedRoom(true);
            System.out.println("Room " + room.getNumber() + " released successfully");
        } else {
            room.setReserved(true);
            user.setHaveReservedRoom(false);
            System.out.println("Room number " + room.getNumber() + " released");
        }
    }


}


