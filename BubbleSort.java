//Optimised Bubble sort(to be optimised) ->count the no of swaps and if after one iteration no doesnt increase then the array is already sorted
//time complexity O(n)
public class BubbleSort
{
    
    public static void bubble(int arr[])
    {
        int num = 0;
        for(int x=0;x<arr.length-1;x++)
        {
            for(int y=0;y<arr.length-1-x;y++)
            {
                if(arr[y]>arr[y+1])
                {
                    num=arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=num;
                }
            }
        }
    }
    public static void print(int arr[])
    {
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) 
    {
        int arr[]={5,4,3,2,1};
        bubble(arr);
        print(arr);
    }
}
