//Kadanes Algorithm
//Verrrrrrryyyyyyy importantttttt
public class MaxSubarraySum3
{
    public static void arrSum(int arr[])
    {
        int gr=Integer.MIN_VALUE;
        boolean check =true;
        for (int i : arr) 
        {
            if(i>0) check=false;
            if(i>gr) gr=i;
        }

        if(check==true)
        {
            System.out.println(gr);
        }

        int cur=0;
        int max=Integer.MIN_VALUE;
        for(int x:arr)
        {

            cur+=x;
            if(cur<0) cur=0;
            if(cur>max) max=cur;
        }
        System.out.println(max);
        
    }
    public static void main(String[] args) 
    {
        // int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        // int arr[]={-1,-2,-3};
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        arrSum(arr);
    }    
}
