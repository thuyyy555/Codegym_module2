package ss14_sort_algorithms;

public class PracticeInsertionSort {
    public static void practiceInsertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
//            System.out.println("Lần lặp thứ "+i+": ");
//            System.out.println("x= "+x);
            pos = i;
//            System.out.println("pos= "+pos);
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];

                pos--;
            }
            array[pos] = x;
            for (int number : array) {
                System.out.print(number + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 1, 2};
        practiceInsertionSort(arr);
        for (int number : arr) {
            System.out.print(number + " ");
        }

    }
}
