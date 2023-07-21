import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cp = sc.nextInt();
        int rupees = sc.nextInt();

        int sp = rupees * 12;

        int profit = sp - cp;
        int loss = cp - sp;

        if (sp == cp) {
            System.out.println("No profit nor loss");
        } else if (sp > cp) {
            System.out.println("Profit : Rs. " + profit);
        } else {
            System.out.println("Loss : Rs. " + loss);
        }

        sc.close();
    }
}
