import java.util.Scanner;

public class FeeCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String department = a.toUpperCase();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        double MSDS = b + c;
        double MSH = b + d;
        double MGSDS = (b * 150 / 100) + b;
        double MGSH = (b * 150 / 100) + d;

        if (department.equals("MSDS")) {
            System.out.printf("%.2f", MSDS);
        } else if (department.equals("MSH")) {
            System.out.printf("%.2f", MSH);
        } else if (department.equals("MGSDS")) {
            System.out.printf("%.2f", MGSDS);
        } else if (department.equals("MGSH")) {
            System.out.printf("%.2f", MGSH);
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
