import java.util.Scanner;

public class Traffic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double speed = sc.nextDouble();
        float distance = sc.nextFloat();
        float time = sc.nextFloat();

        double TimetoReach = distance / speed * 3600;

        if (TimetoReach < time) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
