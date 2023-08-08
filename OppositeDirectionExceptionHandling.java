import java.util.Scanner;

public class OppositeDirectionExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();
        try {

            if (x > y) {

                double ans = (double) z / (x - y);

                if (ans > 0) {
                    System.out.println(ans);
                } else {
                    System.out.println("Will never meet");
                }
            } else {
                System.out.println("Will never meet");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
