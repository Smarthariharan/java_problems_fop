import java.util.Scanner;

public class boating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int a = sc.nextInt();
        int c = sc.nextInt();

        int adult = a * 75;
        int children = c * 30;

        int result = adult + children;

        if (result <= total) {
            System.out.println("Boat is stable");
        } else if (result > total) {
            System.out.println("Boat will sink");
        }
        sc.close();

    }
}
