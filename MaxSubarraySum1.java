//Brute force approach

public class MaxSubarraySum1 
{
    public static void subArray(int arr[]) 
    {
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int x = 0; x < arr.length; x++) 
        {
            for (int y = x; y < arr.length; y++) 
            {
                System.out.print("[");
                curSum = 0;
                for (int z = x; z <= y; z++) 
                {
                    curSum=arr[z]+curSum;
                    if (x == y || z == y) 
                    {
                        System.out.print(arr[z]);
                    } 
                    else
                    {
                        System.out.print(arr[z] + ",");
                    }
                        
                }
                if(curSum>maxSum) maxSum=curSum;
                
                System.out.print("] ");
            }
            System.out.println();
        }
        System.out.print("Maximum SubArray Sum: "+maxSum);
    }

    public static void main(String[] args) 
    {
        int arr[] = { 1, 2, 3, 4, 5 };
        subArray(arr);
    }
}
