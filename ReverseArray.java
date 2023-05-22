public class ReverseArray 
{
    public static void reverse(int arr[])
    {
        int temp;
        for(int x=0;x<arr.length/2;x++)
        {
            temp=arr[x];
            arr[x]=arr[arr.length-1-x];
            arr[arr.length-1-x]=temp;
        }
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5,6,7,8,9};
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        reverse(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
