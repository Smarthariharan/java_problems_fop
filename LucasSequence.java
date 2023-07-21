import java.util.Scanner;

public class LucasSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] lucasSequence = generateLucasSequence(n);

        for (int i = 0; i < n; i++) {
            System.out.print(lucasSequence[i] + " ");
        }

        scanner.close();
    }

    public static int[] generateLucasSequence(int n) {
        int[] lucasSequence = new int[n];
        lucasSequence[0] = 0;
        lucasSequence[1] = 0;
        lucasSequence[2] = 1;

        for (int i = 3; i < n; i++) {
            lucasSequence[i] = lucasSequence[i - 1] + lucasSequence[i - 2] + lucasSequence[i - 3];
        }

        return lucasSequence;

    }
}
