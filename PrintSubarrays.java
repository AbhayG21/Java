public class PrintSubarrays
{
    public static void subArray(int arr[])
    {
        for(int x=0;x<arr.length;x++)
        {
            for(int y=x;y<arr.length;y++)
            {
                System.out.print("[");
                for(int z=x;z<=y;z++)
                {
                    if(x==y||z==y)
                    {
                        System.out.print(arr[z]);
                    }
                    else
                    System.out.print(arr[z]+",");
                }
                System.out.print("] ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = { 1, 2, 3, 4, 5 };
        subArray(arr);
    }    
}
