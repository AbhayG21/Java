// import java.util.*;

public class ZeroOneTriangle {

    public static void main(String[] args) 
    {
        int n=5;
        int count=1;
        
        for(int x=1;x<=n;x++)
        {
            if(x%2!=0)
            {
                count=1;
            }
            else
            {
                count=0;
            }
            for(int y=1;y<=x;y++)
            {
                if(count>1)
                {
                    count=0;
                }
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}