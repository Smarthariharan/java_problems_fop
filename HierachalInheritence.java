
import java.util.Scanner;

public class HierachalInheritence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String color = scan.nextLine();
        int capacity = scan.nextInt();
        int speed = scan.nextInt();
        int price = scan.nextInt();
        int discount = scan.nextInt();

        Details one = new Details(name, color, capacity, speed, price, discount);
        one.commonDetails();
        one.getSportBikeDetails();

        String scooterName = scan.next();
        String scooterColor = scan.next();
        int scooterCapacity = scan.nextInt();
        int scooterSpeed = scan.nextInt();
        int scooterPrice = scan.nextInt();
        int scooterWeight = scan.nextInt();
        int scooterDiscount = scan.nextInt();

        Details two = new Details(scooterName, scooterColor, scooterCapacity, scooterSpeed, scooterPrice, scooterWeight,
                scooterDiscount);

        two.getScooterDetails();

        scan.close();

    }

}

class Details {
    // Sports bike details
    String name;
    String color;
    int capacity;
    int speed;
    int price;
    int weight;
    int discount;
    int finalPrice;

    // Scooter details.

    String scooterName;
    String scooterColor;
    int scooterCapacity;
    int scooterSpeed;
    int scooterPrice;
    int scooterWeight;
    int scooterDiscount;

    public Details(String name, String color, int capacity, int speed, int price, int discount) {
        this.name = name;
        this.color = color;
        this.capacity = capacity;
        this.speed = speed;
        this.price = price;
        this.discount = discount;

    }

    public Details(String scooterName, String scooterColor, int scooterCapacity, int scooterSpeed, int scooterPrice,
            int scooterWeight, int scooterDiscount) {

        this.scooterName = scooterName;
        this.scooterColor = scooterColor;
        this.scooterCapacity = scooterCapacity;
        this.scooterSpeed = scooterSpeed;
        this.scooterPrice = scooterPrice;
        this.scooterWeight = scooterDiscount;
        this.scooterDiscount = scooterWeight;

    }

    public void commonDetails() {
        System.out.println("Enter the details of Sports Bike");
        System.out.println("Name of the bike :");
        System.out.println("Color of the bike :");
        System.out.println("Capacity(cc) of the bike :");
        System.out.println("Speed of the bike :");
        System.out.println("Price of the bike :");
        System.out.println("Discount of the bike :");
        System.out.println("Enter the details of Scooter");
        System.out.println("Name of the Scooter");
        System.out.println("Color of the Scooter :");
        System.out.println("Capacity(CC) of the Scooter :");
        System.out.println("Speed of the Scooter :");
        System.out.println("Price of the Scooter :");
        System.out.println("Discount of the scooter :");
        System.out.println("Weight of the scooter :");

    }

    public void getSportBikeDetails() {
        System.out.println("Sports Bike :");
        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
        System.out.println("Capacity : " + (float) capacity);
        System.out.println("Speed : " + speed);
        System.out.println("Price : " + (float) price);
        System.out.println("Manufacturer Discount : " + discount);
        System.out.println("Sports Bike price is " + (float) (price - discount));

    }

    public void getScooterDetails() {
        System.out.println("Scooter :");
        System.out.println("Name : " + scooterName);
        System.out.println("Color : " + scooterColor);
        System.out.println("Capacity : " + (float) scooterCapacity);
        System.out.println("Speed : " + scooterSpeed);
        System.out.println("Price : " + (float) scooterPrice);
        System.out.println("Weight : " + scooterWeight);
        System.out.println("Manufacturer Discount : " + scooterDiscount);
        System.out.println("Scooter price is " + (float) (scooterPrice - scooterDiscount));

    }
}
