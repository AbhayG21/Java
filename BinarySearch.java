public class BinarySearch 
{
    public static int binSearch(int[] arr,int key)
    {
        // System.out.println("afnkf");
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }

            else if(key>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int key=11;
        System.out.println(binSearch(arr, key));
    }    
}
