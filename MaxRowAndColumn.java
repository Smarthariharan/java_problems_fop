import java.util.Scanner;

public class MaxRowAndColumn {
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

        int[] rowSum = new int[rows];
        int[] columnSum = new int[columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rowSum[i] += fruitArrangement[i][j];
                columnSum[j] += fruitArrangement[i][j];
            }
        }

        int maxRowSum = rowSum[0];
        int maxRowIndex = 0;
        for (int i = 1; i < rows; i++) {
            if (rowSum[i] > maxRowSum) {
                maxRowSum = rowSum[i];
                maxRowIndex = i;
            }
        }

        int maxColumnSum = columnSum[0];
        int maxColumnIndex = 0;
        for (int j = 1; j < columns; j++) {
            if (columnSum[j] > maxColumnSum) {
                maxColumnSum = columnSum[j];
                maxColumnIndex = j;
            }
        }

        System.out.print("Sum of rows is ");
        for (int i = 0; i < rows; i++) {
            System.out.print(rowSum[i] + " ");
        }
        System.out.println();
        System.out.println("Row " + (maxRowIndex + 1) + " has maximum sum");

        System.out.print("Sum of columns is ");
        for (int j = 0; j < columns; j++) {
            System.out.print(columnSum[j] + " ");
        }
        System.out.println();
        System.out.println("Column " + (maxColumnIndex + 1) + " has maximum sum");

        scanner.close();
    }
}
