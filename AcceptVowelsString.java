import java.util.Scanner;

public class AcceptVowelsString {
    public static void main(String[] args) {
        // Try out your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        str = str.toLowerCase();
        String x = "aeiou";
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (str.contains(String.valueOf(x.charAt(i)))) {
                count++;
            }
        }
        if (count == 5) {
            System.out.println("Accepted");
        } else {
            System.out.println("Not Accepted");
        }
    }
}
