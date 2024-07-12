package model;

public class Room {
    private int number;
    private RoomTypes type;
    private boolean isReserved;

    public Room(int number, RoomTypes type, boolean isReserved) {
        this.number = number;
        this.type = type;
        this.isReserved = isReserved;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public RoomTypes getType() {
        return type;
    }

    public void setType(RoomTypes type) {
        this.type = type;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }
}
