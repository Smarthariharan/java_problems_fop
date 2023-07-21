import java.util.Scanner;

public class swimmingPool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int litres = sc.nextInt();

        int area = (a * a * a) * 1000;

        if (litres <= area) {
            System.out.println("Can store");
        } else {
            System.out.println("Cannot store");
        }

        sc.close();

    }
}
