package storage;

import model.ArmenianHotel;
import model.Room;
import model.RoomTypes;

public class RoomStorage {

    private static Room[] rooms = new Room[10];


    public void printRoomTypes(ArmenianHotel hotel){
        for (RoomTypes type : RoomTypes.values()) {
            System.out.println(type.name());
        }
    }

}
