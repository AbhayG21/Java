public class SpiralPrint 
{
    // 1  2  3  4  
    // 5  6  7  8  
    // 9  10 11 12 
    // 13 14 15 16 

    //1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

    // 1  2  3  4  5
    // 6  7  8  9  10
    // 11 12 13 14 15
    // 16 17 18 19 20
    // 21 22 23 24 25

    //1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13

    public static void spiral(int arr[][])
    {
        int sr=0,sc=0;
        int er=arr.length-1,ec=arr[0].length-1;

        while(sr<=er && sc<=er)
        {
            //Top
            for(int c=sc;c<=ec;c++)
            {
                System.out.print(arr[sr][c]+" ");
            }

            //Right
            for(int r=sr+1;r<=er;r++)
            {
                System.out.print(arr[r][ec]+" ");
            }

            //Bottom
            for(int c=ec-1;c>=sc;c--)
            {
                if (sr == er)
                    break;
                System.out.print(arr[er][c]+" ");
            }

            //Left
            for(int r=er-1;r>=sr+1;r--)
            {
                if (sc == ec)
                    break;
                
                System.out.print(arr[r][sc]+" ");
            }


            sc++;
            sr++;
            ec--;
            er--;

        }
        
    }
    public static void main(String[] args) 
    {
        int count=1;
        int n=4;
        int arr[][]=new int[n][n];
        for(int x=0;x<n;x++)
        {
            for(int y=0;y<n;y++)
            {
                arr[x][y]=count++;
            }
        }    

        spiral(arr);
        
    }    
}
