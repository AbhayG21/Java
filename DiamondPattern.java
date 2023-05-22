import java.util.*;
public class DiamondPattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int x=1;x<=n;x++)
        {
            for(int s=n-x;s>=1;s--)
            {
                System.out.print(" ");
            }

            for(int y=1;y<=2*x -1;y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int x=n;x>=1;x--)
        {
            for(int s=1;s<=n-x;s++)
            {
                System.out.print(" ");
            }
            for(int y=2*x -1;y>=1;y--)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        sc.close();
    }
}
