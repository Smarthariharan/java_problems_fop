import java.util.Scanner;

public class EvenFrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int sum = 0;
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count % 2 == 0) {
                    sum += count;
                }
                count = 1;
            }
        }
        if (count % 2 == 0) {
            sum += count;
            System.out.println(sum);

        }

    }
}
