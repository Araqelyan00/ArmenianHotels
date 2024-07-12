package command;

public interface Menu {

    int EXIT = 0;
    int PRINT_ALL_HOTELS = 1;
    int PRINT_HOTEL_BY_NAME = 2;
    int PRINT_HOTELS_BY_STARS_COUNT = 3;
    int PRINT_HOTELS_BY_ADDRESS = 4;

    int ADD_NEW_HOTEL = 5;
    int DELETE_HOTEL = 6;
    int RESERVE_ROOM = 7;
    int RELEASE_ROOM = 8;
    int PRINT_AVAILABLE_ROOMS_LIST = 9;
    int PRINT_AVAILABLE_ROOMS_BY_TYPE = 10;
    int LOGIN_AS_ADMIN = 99;

    static void printUserCommands(){
        System.out.println("Input " + EXIT + " to exit");
        System.out.println("Input " + PRINT_ALL_HOTELS + " to print all hotels");
        System.out.println("Input " + PRINT_HOTEL_BY_NAME + " to print hotel by name");
        System.out.println("Input " + PRINT_HOTELS_BY_STARS_COUNT + " to print hotels by stars count");
        System.out.println("Input " + PRINT_HOTELS_BY_ADDRESS + " to print hotels by address");
        System.out.println("Input " + LOGIN_AS_ADMIN + " to login as admin");
        System.out.println("Enter command: ");
    }

    static void printAdminCommands(){
        System.out.println("Input " + EXIT + " to exit");
        System.out.println("Input " + PRINT_ALL_HOTELS + " to print all hotels");
        System.out.println("Input " + PRINT_HOTEL_BY_NAME + " to print hotel by name");
        System.out.println("Input " + PRINT_HOTELS_BY_STARS_COUNT + " to print hotels by stars count");
        System.out.println("Input " + PRINT_HOTELS_BY_ADDRESS + " to print hotels by address");
        System.out.println("Input " + LOGIN_AS_ADMIN + " to login as admin");
        System.out.println("Input " + ADD_NEW_HOTEL + " to add new hotel");
        System.out.println("Input " + DELETE_HOTEL + " to delete hotel");
        System.out.println("Input " + RESERVE_ROOM + " to reserve room");
        System.out.println("Input " + RELEASE_ROOM + " to release room");
        System.out.println("Input " + PRINT_AVAILABLE_ROOMS_LIST + " to print available rooms");
        System.out.println("Input " + PRINT_AVAILABLE_ROOMS_BY_TYPE + " to print available rooms by type");
        System.out.println("Enter command: ");
    }

}
