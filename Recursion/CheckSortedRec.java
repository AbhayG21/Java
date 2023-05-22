public class CheckSortedRec
{
    public static boolean func(int arr[],int x)
    {
        if(x>=arr.length-1) return true;
        if(arr[x]>arr[x+1]) return false;
        else return func(arr,x+1);
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4};

        System.out.println(func(arr,0));
    }
}