import java.util.*;
public class FindIndicesOfKeyRec {
    public static int func(int arr[],int n,int x,int key)
    {
        if(x==n) return -1;
        if(arr[x]==key)
        {
            return x;
        }
        return func(arr,n,x+1,key);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int x=0;x<n;x++)
        {
            arr[x]=sc.nextInt();
        }
        System.out.print("Key: ");
        int key=sc.nextInt();
        System.out.println(func(arr,n,0,key));
        sc.close();
    }
}
