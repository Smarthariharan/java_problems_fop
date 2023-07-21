import java.util.Scanner;

public class SeriesIX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 2;

        for (int i = 1; i <= n; i++) {
            int result = i * 13 + number;
            System.out.print(number + " ");
            number = result;

        }
        sc.close();
    }

}
