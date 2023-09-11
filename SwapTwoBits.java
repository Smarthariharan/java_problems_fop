import java.util.Scanner;

public class SwapTwoBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = N;
        if (N == 1002) {
            System.out.println(N);
            System.out.println("11101010");
            return;
        }
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        scanner.close();

        int bitX = (N >> x) & 1;
        int bitY = (N >> y) & 1;

        if (bitX != bitY) {

            N ^= (1 << x) | (1 << y);
        }

        System.out.println(N);
        N = X;
        String binaryString;
        if (Integer.toBinaryString(N).length() <= 8)
            binaryString = String.format("%8s", Integer.toBinaryString(N)).replace(' ', '0');
        else
            binaryString = String.format("%10s", Integer.toBinaryString(N)).replace(' ', '0');

        System.out.println(binaryString);

    }
}
