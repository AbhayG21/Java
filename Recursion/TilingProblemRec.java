import java.util.*;
public class TilingProblemRec 
{
    public static int func(int n)
    {
        //Base Case
        if(n==1||n==0) return 1;

        //Kaam
        int vertical=func(n-1); // dimensions if tile 2 x 1 so if 1 tile is put vertically,free length of floor is n-1
        int horizontal=func(n-2); // if 1 tile is put horizontally , free length of floor is n-2

        return vertical+horizontal;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of floor: ");
        int n=sc.nextInt();
        System.out.println(func(n));
        sc.close();
    }    
}
