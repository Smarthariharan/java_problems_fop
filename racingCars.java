import java.util.Scanner;

public class racingCars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cars = sc.nextInt();

        if (a % cars == 0) {
            System.out.println("Car 1 goes into road A");
        } else if (b % cars == 0) {
            System.out.println("Car 1 goes into road B");
        } else if (c % cars == 0) {
            System.out.println("Car 1 goes into road C");
        } else {
            System.out.println("No path exists");
        }

        sc.close();
    }
}
