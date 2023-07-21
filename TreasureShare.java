import java.util.Scanner;

public class TreasureShare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCoins = sc.nextInt();

        int benSharePercentage = sc.nextInt();
        int blackbeardSharePercentage = sc.nextInt();

        int benShare = (benSharePercentage * totalCoins) / 100;

        int remainingCoins = totalCoins - benShare;

        int blackbeardShare = (blackbeardSharePercentage * remainingCoins) / 100;

        int otherPiratesShare = (remainingCoins - blackbeardShare) / 3;

        System.out.println(benShare);
        System.out.println(blackbeardShare);
        System.out.println(otherPiratesShare);

        sc.close();
    }
}
