import java.util.Scanner;

public class BankCandO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String b = scanner.next();
        String c = scanner.next();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        scanner.close();
        int bal = (d + e) - f;
        System.out.println("Enter Details:");
        System.out.println("Account No.");

        System.out.println("Name :");

        System.out.println("Account Type :");

        System.out.println("Balance :");

        System.out.println("Enter Deposit Amount =");

        System.out.println("Enter Withdraw Amount =");
        if (bal <= 0) {
            System.out.println("Cannot Withdraw Amount");
        }
        System.out.println("Account No. : " + a);

        System.out.println("Name : " + b);

        System.out.println("Account Type : " + c);

        System.out.println("Balance : " + bal);

    }
}
