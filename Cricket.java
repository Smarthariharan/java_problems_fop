import java.util.Scanner;

public class Cricket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int balls = scan.nextInt();
        int totalRuns = scan.nextInt();
        int runsScored = scan.nextInt();
        int bowled = scan.nextInt();

        int overs = balls / 6;
        int finishedOvers = bowled / 6;
        float finished = (bowled % 6) * 0.1f;
        float runrate = runsScored / (finishedOvers + finished);
        float totalRunrate = (float) totalRuns / overs;

        System.out.println(overs);
        System.out.println(finishedOvers + finished);
        System.out.printf("%.1f\n", runrate);
        System.out.printf("%.1f\n", totalRunrate);
        if (runrate >= totalRunrate) {
            System.out.println("Eligible to Win");
        } else {
            System.out.println("Not Eligible to Win");
        }
        scan.close();
    }
}
