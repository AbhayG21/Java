public class SelectionSort 
{
    public static void selection(int arr[]) 
    {
        int num = 0;
        for (int x = 0; x < arr.length - 1; x++) 
        {
            int minPos=x;
            for (int y = x+1; y < arr.length ; y++) 
            {
                if(arr[y]<arr[minPos])
                {
                    minPos=y;
                }
            }
            num=arr[minPos];
            arr[minPos] = arr[x];
            arr[x]=num;
        }
    }
    
    public static void print(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        selection(arr);
        print(arr);
    }

}

