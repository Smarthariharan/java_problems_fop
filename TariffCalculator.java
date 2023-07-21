import java.util.Scanner;

public class TariffCalculator {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the month (1-12): ");
        // int month = scanner.nextInt();
        // System.out.print("Enter the room rent per day: ");
        // double roomRent = scanner.nextDouble();
        // System.out.print("Enter the number of days stayed: ");
        // int numDays = scanner.nextInt();
        // scanner.close();

        // double totalTariff;

        // switch (month) {
        // case 4:
        // case 5:
        // case 6:
        // case 11:
        // case 12:
        // totalTariff = roomRent * numDays * 1.2;
        // break;
        // default:
        // totalTariff = roomRent * numDays;
        // break;
        // }

        // System.out.printf("%.2f", totalTariff);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a value between 1 and 12.");
            scanner.close();
            return;
        }

        System.out.print("Enter the room rent per day: ");
        double roomRent = scanner.nextDouble();

        System.out.print("Enter the number of days stayed: ");
        int numDays = scanner.nextInt();

        double totalTariff;

        if (month >= 4 && month <= 6 || month >= 11 && month <= 12) {

            double increaseAmount = roomRent * 0.2;

            totalTariff = (roomRent + increaseAmount) * numDays;
        } else {

            totalTariff = roomRent * numDays;
        }

        System.out.printf(" %.2f", totalTariff);

        scanner.close();

    }
}
