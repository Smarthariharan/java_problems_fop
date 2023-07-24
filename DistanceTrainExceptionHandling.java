import java.util.Scanner;

public class DistanceTrainExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();
        double distanceTraveled = 1;

        try {
            double time = (double) d / (x + y);
            distanceTraveled = z * time;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(distanceTraveled);
        }

    }

}
