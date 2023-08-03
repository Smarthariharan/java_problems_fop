import java.util.Scanner;

class NormalRoom {
    public int calculates(int no_rooms, int days) {
        if (days == 1) {
            return 300 * no_rooms;
        } else if (days <= 5) {
            return 250 * no_rooms * days;
        } else {
            return 200 * no_rooms * days;
        }
    }
}

class AC_Room {
    public int AC_calculates(int no_rooms, int days) {
        if (days == 1) {
            return 450 * no_rooms;
        } else if (days <= 5) {
            return 300 * no_rooms * days;
        } else {
            return 250 * no_rooms * days;
        }
    }
}

class Suite_Room {
    public int Suite_calculates(int no_rooms, int days) {
        if (days == 1) {
            return 550 * no_rooms;
        } else if (days <= 5) {
            return 500 * no_rooms * days;
        } else {
            return 450 * no_rooms * days;
        }
    }
}

class Hotel extends NormalRoom {
    private String name;
    private String address;
    private String mobile;

    public void display() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        address = sc.nextLine();
        mobile = sc.nextLine();
        int no_rooms = sc.nextInt();
        int days = sc.nextInt();
        int choice = sc.nextInt();
        sc.close();

        double roomRent = 0;

        if (choice == 1) {
            roomRent = calculates(no_rooms, days);
        } else if (choice == 2) {
            AC_Room acRoom = new AC_Room();
            roomRent = acRoom.AC_calculates(no_rooms, days);
        } else if (choice == 3) {
            Suite_Room suiteRoom = new Suite_Room();
            roomRent = suiteRoom.Suite_calculates(no_rooms, days);
        } else {
            System.out.println("Invalid Choice");
            return;
        }
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Mobile: " + mobile);
        System.out.println("Room Rent = " + (int) roomRent);
    }
}

public class RentInterface {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.display();
    }
}
