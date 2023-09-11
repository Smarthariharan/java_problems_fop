import java.util.*;

public class BacterialInfection {
    static int MAX_ROW = 20;
    static int MAX_COL = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount, colCount;
        int startRow, startCol;
        char roomLayout[][] = new char[MAX_ROW][MAX_COL];

        rowCount = scanner.nextInt();
        colCount = scanner.nextInt();
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                roomLayout[i][j] = scanner.next().charAt(0);
            }
        }
        startRow = scanner.nextInt();
        startCol = scanner.nextInt();
        scanner.close();

        int spreadTime = calculateInfectionTime(roomLayout, startRow, startCol, rowCount, colCount);
        System.out.println(spreadTime);
    }

    static void spreadInfection(char roomLayout[][], int row, int col, int rowCount, int colCount,
            int infectionTime[][], int currentTime) {
        if (row < 0 || row >= rowCount || col < 0 || col >= colCount || roomLayout[row][col] == 'c') {
            return;
        }

        if (currentTime >= infectionTime[row][col]) {
            return;
        }

        infectionTime[row][col] = currentTime;

        spreadInfection(roomLayout, row, col + 1, rowCount, colCount, infectionTime, currentTime + 1);
        spreadInfection(roomLayout, row - 1, col, rowCount, colCount, infectionTime, currentTime + 1);
        spreadInfection(roomLayout, row, col - 1, rowCount, colCount, infectionTime, currentTime + 1);
        spreadInfection(roomLayout, row + 1, col, rowCount, colCount, infectionTime, currentTime + 1);
    }

    static int calculateInfectionTime(char roomLayout[][], int startRow, int startCol, int rowCount, int colCount) {
        int infectionTime[][] = new int[MAX_ROW][MAX_COL];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                infectionTime[i][j] = Integer.MAX_VALUE;
            }
        }

        spreadInfection(roomLayout, startRow, startCol, rowCount, colCount, infectionTime, 1);

        int maxSpreadTime = 0;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (infectionTime[i][j] != Integer.MAX_VALUE && maxSpreadTime < infectionTime[i][j]) {
                    maxSpreadTime = infectionTime[i][j];
                }
            }
        }
        return maxSpreadTime;
    }
}