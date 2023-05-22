public class CountSort 
{
    public static void sort(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int x=0;x<arr.length;x++)
        {
            if(arr[x]>max) max=arr[x];
        }

        int count[]=new int[max+1]; //[0,1,2,3,4,5]

        //Brute force approach
        // for(int x=0;x<arr.length;x++)
        // {
        //     for(int y=0;y<count.length;y++)
        //     {
        //         if(arr[x]==y)
        //         {
        //             count[y]++;
        //         }
        //     }
        // }

        //Optimised approach
        for(int x=0;x<arr.length;x++)
        {
            count[arr[x]]++;
        }

        int pos=0;
        for(int x=0;x<count.length;x++)
        {
            while(count[x]!=0)
            {
                arr[pos]=x;
                count[x]--;
                pos++;
            }
        }

        for (int i : arr) 
        {
            System.out.print(i+" ");    
        }

    }
    public static void main(String[] args) 
    {
        // int arr[]={5,4,3,2,1,3};
        int arr[]={1, 4, 1, 2, 7, 5, 2};
        sort(arr);

    }    
}
