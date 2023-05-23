import java.util.*;
//Time : O(n log n)
//Space: O(n)
public class MergerSortDC {
    public static void printArr(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei)
            return;
        // kaam
        int mid = si + (ei - si) / 2; // (si+ei)/2
        mergeSort(arr, si, mid); // left
        mergeSort(arr, mid + 1, ei); // right
        merge(arr, si, mid, ei);

    }
    public static void merge(int arr[], int si, int mid, int ei) 
    {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) 
        {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        
        }
        //left
        while(i<=mid)
        {
            temp[k]=arr[i];
            k++;
            i++;
        }
        while (j <= ei) {
            temp[k] = arr[i];
            k++;
            j++;
        }

        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int x = 0; x < n; x++) {
            arr[x] = sc.nextInt();
        }
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
        sc.close();
    }
}
