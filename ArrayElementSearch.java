import java.util.Scanner;

public class ArrayElementSearch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }
        int elementToSearch = scan.nextInt();
        scan.close();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == elementToSearch) {

                System.out.print(elementToSearch + " is present in the array");
                return;
            }
        }

        System.out.print(elementToSearch + " is not present in the array");

    }
}
