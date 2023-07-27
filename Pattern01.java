import java.util.Scanner;

public class Pattern01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int zero = 0;
        int one = 1;
        scanner.close();
        System.out.println(zero);
        for (int i = 1; i < a; i++) {

            for (int j = 1; j <= i + 1; j++) {

                if (i % 4 == 0 || i % 4 == 3) {

                    if (j % 2 != 0) {
                        System.out.print(zero + " ");
                    } else {
                        System.out.print(one + " ");
                    }
                } else {
                    if (j % 2 != 0) {
                        System.out.print(one + " ");
                    } else {
                        System.out.print(zero + " ");
                    }
                }

            }
            System.out.println();

        }
    }
}
