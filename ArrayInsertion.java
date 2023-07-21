import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num + 1];

        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }

        int index = scan.nextInt();
        if (num < index) {
            System.out.println("Invalid Input");
            return;
        }
        int valueToInsert = scan.nextInt();
        scan.close();

        int[] newarr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i < index - 1) {
                newarr[i] = arr[i];
            } else if (i == index - 1) {
                newarr[i] = valueToInsert;
            } else {
                newarr[i] = arr[i - 1];
            }

        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }

    }
}
