public class PairsInArray
{
    public static void pair(int arr[])
    {
        int tp=0;
        for(int x=0;x<arr.length;x++)
        {
            for(int y=x+1;y<arr.length;y++)
            {
                System.out.print("("+ arr[x] + ","+arr[y]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total pairs: "+tp);
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5};    
        pair(arr);
    }    
}
