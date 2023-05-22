public class RhombusPattern 
{
    public static void main(String[] args) 
    {
        int n=5;
        
        for(int x=1;x<n;x++)
        {
            //spaces
            for(int s=n-1;s>=x;s--)
            {
                System.out.print(" ");
            }

            //stars
            for(int y=1;y<=x;y++)
            {
                System.out.print("*");
            }

            // stars2
            for(int z=n-1;z>=x;z--)
            {
            System.out.print("*");
            }
            System.out.println();
        }
        
    }    
}
