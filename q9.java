package map_classwork;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class q9 {

    private TreeMap<Integer, String> rooms;

    public q9() {
        rooms = new TreeMap<>();
    }

    public void addRoom(int id, String type) {
        rooms.put(id, "Available");
    }

    public boolean reserveRoom(int id) {
        if (rooms.containsKey(id) && rooms.get(id).equals("Available")) {
            rooms.put(id, "Occupied");
            return true;
        }
        return false;
    }

    public boolean releaseRoom(int id) {
        if (rooms.containsKey(id) && rooms.get(id).equals("Occupied")) {
            rooms.put(id, "Available");
            return true;
        }
        return false;
    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        for (int entry:rooms.keySet()) {
            if (rooms.get(entry).equals("Available")) {
                System.out.println("ID: " + entry);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        q9 hotel = new q9();

        // Add some sample rooms
        hotel.addRoom(101, "Single");
        hotel.addRoom(102, "Double");
        hotel.addRoom(103, "Suite");

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Reserve Room");
            System.out.println("2. Release Room");
            System.out.println("3. Display Available Rooms");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter room ID to reserve: ");
                    int id = scanner.nextInt();
                    if (hotel.reserveRoom(id)) {
                        System.out.println("Room " + id + " successfully reserved.");
                    } else {
                        System.out.println("Room " + id + " is unavailable.");
                    }
                    break;
                case 2:
                    System.out.print("Enter room ID to release: ");
                    id = scanner.nextInt();
                    if (hotel.releaseRoom(id)) {
                        System.out.println("Room " + id + " successfully released.");
                    } else {
                        System.out.println("Room " + id + " is already available.");
                    }
                    break;
                case 3:
                    hotel.displayAvailableRooms();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        // scanner.close();
    }
}

