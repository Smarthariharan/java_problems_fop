import java.util.Scanner;

public class MaxMinString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String out = str.replaceAll("\\s", "");
        scan.close();

        int[] arr = new int[out.length()];
        for (int i = 0; i < out.length(); i++) {
            int count = 0;
            for (int j = i + 1; j < out.length(); j++) {

                if (out.charAt(i) == out.charAt(j)) {
                    count++;
                }

            }
            arr[i] = count;
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        ;
        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                index1 = i;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                index2 = i;
                break;
            }
        }

        System.out.println("Minimum occurring character: " + out.charAt(index2));

        System.out.println("Maximum occurring character: " + out.charAt(index1));
    }
}
