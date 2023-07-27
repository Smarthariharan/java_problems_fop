import java.util.Scanner;

public class TargetPractice {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int targetScore = sc.nextInt();
        int score = 0;
        int turns = 0;

        while (score < targetScore) {
            int hitScore = sc.nextInt();
            score += hitScore;
            turns++;
        }

        sc.close();

        System.out.println("The number of turns is " + turns);
    }
}
