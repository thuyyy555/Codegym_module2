package ss13_search_algorithm;

public class BinarySearch {
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
    public static int binarySearch(int[] arr, int value, int left, int right){
        if(right>=left){
            int middle = (left+right)/2;
            if(arr[middle]==value){
                return middle;
            }
            else if(value>arr[middle]){
                return binarySearch(arr, value, middle+1, right);
            }
            else{
                return binarySearch(arr, value, left, middle-1);
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 4};
        int value = 4;
        insertionSort(arr);
        System.out.println(binarySearch(arr, value, 0,arr.length-1));
    }
}
