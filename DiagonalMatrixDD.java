import java.util.Scanner;

public class DiagonalMatrixDD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int[][] arr = new int[row][row];
        boolean chk = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = scan.nextInt();
                if (j == i) {
                    continue;
                } else {
                    if (arr[i][j] != 0) {
                        chk = true;

                    }
                }
            }
        }
        scan.close();
        if (chk == false) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }
}
