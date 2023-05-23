import java.util.*;
public class QuickSortDC {
    public static void printArr(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
    public static void quickSort(int arr[],int si,int ei)
    {
        if(si>=ei) return;
        //kaam
        int pIndx=partition(arr,si,ei);
        quickSort(arr, si, pIndx-1);
        quickSort(arr, pIndx+1, ei);
    }
    public static int partition(int arr[],int si,int ei)
    {
        int pivot=arr[ei];
        int i=si-1; //to make place for elements smaller than pivot
        for(int x=si;x<ei;x++)
        {
            if(arr[x]<=pivot)
            {
                i++;
                int temp=arr[x];
                arr[x]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int x = 0; x < n; x++) {
            arr[x] = sc.nextInt();
        }
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
        sc.close();
    }
}
