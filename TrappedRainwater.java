public class TrappedRainwater 
{
    public static int rainWater(int height[])
    {
        int size=height.length;
        //calc left max boundary -- array
        int Lmax[]=new int[size];
        int left=Integer.MIN_VALUE;
        Lmax[0]=height[0];
        for(int x=1;x<size;x++)
        {
            // if(x==0) 
            // {
            //     Lmax[x]=height[x];
            //     left=Lmax[x];
            // }
            // else
            // {
                left=Math.max(left, height[x-1]);
                if(left>height[x])
                {
                    Lmax[x] = left;
                }
                else 
                {
                    Lmax[x]=height[x];
                }
                
            // }
        }

        // for (int i : Lmax) 
        // {
        //     System.out.print(i+" ");
        // }
        //calc right max boundary -- array
        int Rmax[] = new int[size];
        int right = Integer.MIN_VALUE;
        Rmax[size-1]=height[size-1];
        for (int x = size-2; x >=0; x--) 
        {
            
                right = Math.max(right, height[x+1]);
                if(right>height[x])
                {
                    Rmax[x] = right;
                }
                else
                {
                    Rmax[x]=height[x];
                }
                
        }
        // for (int i: Rmax) {
        //     System.out.print(i + " ");
        // }

        //loop
        //waterlevel=min(leftMax,rightMax)
        int waterLevel[]=new int[size];
        for(int x=0;x<size;x++)
        {
            waterLevel[x]=Math.min(Lmax[x],Rmax[x]);
        }
        //trappedWater=waterlevel-height[i]
        int trappedWater=0;

        for (int x = 0; x < size; x++) {
            trappedWater+=waterLevel[x]-height[x];
        }

        return trappedWater;
    }
    public static void main(String[] args) 
    {
        int height[]={4,2,0,6,3,2,5};
        int x=rainWater(height);
        System.out.println("Total trapped rainwater: "+x);
    }    
}
