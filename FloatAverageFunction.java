import java.util.Scanner;

public class FloatAverageFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        sc.close();
        int result = FindFloatAverage(str, n);
        System.out.println(result);

    }

    public static int FindFloatAverage(String str, int n) {
        int sum = 0;

        char[] charArray = new char[n];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        for (int i = 0; i < charArray.length; i++) {

            sum += (int) charArray[i];
        }
        int result = sum / n;
        return result;
    }
}
