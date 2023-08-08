import java.util.Scanner;

public class PatternX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 1;
        int l = 2;
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < 1; j++) {
                if (i % 2 != 0 && (i + 1) % 2 == 0) {
                    System.out.print(y);
                } else {
                    y += 2;
                    System.out.print(y);
                }
            }
            for (int k = 1; k <= x - 2; k++) {
                System.out.print(i);
            }
            for (int g = 0; g < 1; g++) {
                System.out.print(l);
                if (i % 2 == 0) {
                    l += 2;
                }
            }
            System.out.println();
        }
        sc.close();

    }
}
