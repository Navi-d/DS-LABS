package Lab10;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {45, 7, 2, 8, 19, 3};
        SelectionSort.selectSortSmallest(arr);
        
        System.out.println("SortSmallest");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();

        SelectionSort.selectSortLargest(arr);

        
        System.out.println("SortLargest");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }                                               // i=1 | j=5 | k=5
    
    public static void selectSortSmallest(int[] a) { // 2, 3, 45, 8, 19, 7
        for (int i = 0; i < a.length - 1; i++) {
            int j = i;
            for (int k = i + 1; k < a.length; k++) {
                if (a[k] < a[j]) {
                    j = k;
                }
            }
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
    }
    
    public static void selectSortLargest(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int j = i;
            for (int k = i + 1; k < a.length; k++) {
                if (a[k] > a[j]) {
                    j = k;
                }
            }
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
    }
}
