import java.util.Scanner;

public class AmoebaControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();

        int size = calculateAmoebaSize(month);

        System.out.println(size);

        scanner.close();
    }

    public static int calculateAmoebaSize(int month) {
        if (month <= 0) {
            return 0;
        } else if (month == 1 || month == 2) {
            return month - 1;
        } else {
            int prev = 0;
            int curr = 1;

            int size = 0;

            for (int i = 3; i <= month; i++) {
                size = prev + curr;
                prev = curr;
                curr = size;
            }

            return size;
        }
    }
}
