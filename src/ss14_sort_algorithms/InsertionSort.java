package ss14_sort_algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 5};
        insertionSort(arr);
        for (int number : arr) {
            System.out.println(number);
        }
    }
    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }
}
