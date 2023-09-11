import java.util.Scanner;

public class LongestConsecutiveOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {

            int N = scanner.nextInt();

            int maxLength = findLongestConsecutiveOnes(N);
            System.out.println(maxLength);
        }

        scanner.close();
    }

    public static int findLongestConsecutiveOnes(int N) {
        int maxLength = 0;
        int currentLength = 0;

        while (N > 0) {
            if ((N & 1) == 1) {

                currentLength++;
            } else {
                currentLength = 0;
            }

            maxLength = Math.max(maxLength, currentLength);

            N >>= 1;
        }

        return maxLength;
    }
}
