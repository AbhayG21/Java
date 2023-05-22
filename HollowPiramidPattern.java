//    1
//   2 2
//  3   3
// 4444444

import java.util.*;
public class HollowPiramidPattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int n=sc.nextInt();
        for(int x=1;x<=n;x++)
        {
            for(int y=x;y<=2*x-1;y++)
            {
                if(y==x || x==n || y==2*x-1)
                {
                    System.out.print(x);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();    
    }
}
