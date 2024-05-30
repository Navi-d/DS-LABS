package Lab10;

public class MyInsertionSort {
    public static void main(String a[]) {
        int[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] arr2 = doInsertionSort(arr1);
        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");
        }
    }

    public static int[] doInsertionSort(int[] input) {
        int temp;
        for (int i = 1; i < input.length; i++) { // i=2 | j=1
            for (int j = i; j > 0; j--) {        // 2, 10, 34, 56
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }
}
