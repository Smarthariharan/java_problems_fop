import java.util.Scanner;

public class SumOfElementsDD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();

        int columns = scanner.nextInt();

        int[][] fruitArrangement = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                fruitArrangement[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            int matrix = 0;
            for (int j = 0; j < columns; j++) {
                matrix += fruitArrangement[i][j];
            }
            System.out.println(matrix);
        }

        scanner.close();

    }
}
