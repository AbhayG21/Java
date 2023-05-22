public class HollowRhombus{
    public static void main(String[] args) {
        int n = 5;

        for (int x = 1; x <= n; x++) {
            // spaces
            for (int s = n - 1; s >= x; s--) {
                System.out.print(" ");
            }

            // stars
            

            for (int y = 1; y <= x; y++) 
            {
                if (x==n ||y==1)
                {
                    System.out.print("*");
                }
               
                else
                {
                    System.out.print(" ");
                }
                
            }

            // stars2
            for (int z = n - 1; z >= x; z--) 
            {
                if(z==x || x==1)
                {
                    System.out.print("*");
                }

                else
                {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

    }
}
