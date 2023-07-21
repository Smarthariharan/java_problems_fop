import java.util.Scanner;

public class PrintingMStar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j == 0 || j == height - 1 || (i == j && j <= height / 2)
                        || (i + j == height - 1 && i <= height / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            System.out.println();

        }
        sc.close();
    }
}
