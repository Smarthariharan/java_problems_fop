import java.util.Scanner;

public class carMileage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float mileage = a * b;

        if (mileage < c) {
            System.out.println("Cannot reach");
        } else {
            System.out.println("Can reach");
        }

        sc.close();

    }
}