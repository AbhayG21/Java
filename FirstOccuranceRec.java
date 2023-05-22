public class FirstOccuranceRec
{
    public static int func(int n,int i ,int arr[])
    {
        if(i==arr.length) return -1;
        else if(arr[i]==n) return i;
        else return func(n,i+1,arr);
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5};
        int n=12;
        System.out.println(func(n, 0, arr));
    }    
}
