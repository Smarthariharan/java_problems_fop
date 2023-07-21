import java.util.Scanner;

public class FrequencyCharString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        char[] out = str.toCharArray();
        scan.close();

        System.out.println("Characters and their corresponding frequencies");
        for (int i = 0; i < out.length; i++) {
            int count = 1;
            for (int j = i + 1; j < out.length; j++) {

                if (out[i] == out[j]) {
                    count++;
                    out[j] = ' ';

                }

            }

            if (out[i] != ' ') {
                System.out.println(out[i] + "-" + count);
            }
        }

    }

}
