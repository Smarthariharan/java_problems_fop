import java.util.Scanner;

public class quadrants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x > 0 && y > 0) {
            System.out.println("1st quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("2nd quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("3rd quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("4th quadrant");
        }

        sc.close();

    }
}
