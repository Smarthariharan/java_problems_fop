import java.util.*;

class AccountInterface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        String acc = sc.next();
        int accno = sc.nextInt();
        int money = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String date = sc.nextLine();
        int month = sc.nextInt();
        sc.close();
        System.out.println("1.Current Account");
        System.out.println("2.Savings Account");
        System.out.println("Name");
        System.out.println("Account Number");
        System.out.println("Account Balance");
        System.out.println("Enter the Start Date(yyyy-mm-dd)");
        System.out.println("Enter the Years");
        Account a = new Account(month);
        // Current c = new Current(month);
        if (type == 1) {
            a.currentAccount();
        } else {
            a.savingsAccount();
        }
    }
}

interface account {
    void currentAccount();

    void savingsAccount();
}

class Account implements account {
    double month;

    public Account(double month) {
        this.month = month;
    }

    public void currentAccount() {
        double maintenanceCharge = (100 * month) + 200;
        System.out.print("Maintenance Charge For Current Account: ");
        System.out.printf("%.2f%n", maintenanceCharge);
    }

    public void savingsAccount() {
        double maintenanceCharge = 2 * (50 * month) + 50;
        System.out.printf("Maintenance Charge For Savings Account: %.2f%n", maintenanceCharge);
    }
}
