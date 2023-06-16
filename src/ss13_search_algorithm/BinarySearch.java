package ss13_search_algorithm;

public class BinarySearch {
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
        int[] arr = {1, 2, 3, 4};
        int value = 4;
        System.out.println(binarySearch(arr, value, 0,arr.length-1));
    }
}
