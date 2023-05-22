import java.util.*;

// 1  2  3  4  
// 5  6  7  8  
// 9  10 11 12 
// 13 14 15 16 

// 1  2  3  4  5
// 6  7  8  9  10
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25

public class DiagonalSum
{
    public static void sum(int arr[][])
    {
        int r=arr.length,c=arr[0].length;
        int d1=0,d2=0;
        for(int x=0;x<r && x<c;x++)
        {
            d1+=arr[x][x];
        }

        for(int x=r-1,y=0;x>=0 && y<c;x--,y++)
        {
            if(x==y) continue;
            d2+=arr[x][y];
        }
        System.out.println(d1+d2);

    }

    public static void main(String[] args) 
    {
        int count = 1;
        int n = 5;
        int arr[][] = new int[n][n];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                arr[x][y] = count++;
            }
        }
        sum(arr);
        
    }    
}
