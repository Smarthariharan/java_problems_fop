public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 10, 7, 9, 50, 45 };

        System.out.println("Original Array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    public static void bubbleSort(int[] array) {

        boolean swap = true;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = false;
                }
            }
            if (swap) {
                break;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
