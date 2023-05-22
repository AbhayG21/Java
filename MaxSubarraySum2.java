
//Prefix sum approach
public class MaxSubarraySum2 {
    public static void subArray(int arr[]) {
        int curSum = 0;
        int prefix[]=new int[arr.length];
        int maxSum = Integer.MIN_VALUE;

        prefix[0]=arr[0];
        for(int x=1;x<prefix.length;x++)
        {
            prefix[x]=prefix[x-1]+arr[x];
        }
        for (int x = 0; x < arr.length; x++) 
        {
            for (int y = x; y <arr.length; y++) 
            {
                curSum= x==0?prefix[y]:prefix[y]-prefix[x-1];
            }
            if(curSum>maxSum)
            {
                maxSum=curSum;
            }
        }

        System.out.print("Maximum SubArray Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        subArray(arr);
    }
}
