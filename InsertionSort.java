import java.util.Arrays;
import java.util.Collections;

public class InsertionSort {
    public static void insertion(int arr[]) {
        for (int x = 1; x < arr.length; x++) {
            int cur = arr[x];
            int prev = x - 1;
            while (prev >= 0 && arr[prev] > cur) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = cur;
        }
    }

    public static void print(int arr[]) 
    {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1, 7 };
        insertion(arr);
        print(arr);
    }

}
