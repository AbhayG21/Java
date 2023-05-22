public class NthFibNumRec 
{
    public static int func(int n)
    {
        if(n==1 || n==0) return n;
        else return func(n-1)+func(n-2);
    }
    public static void main(String[] args) 
    {
        System.out.println(func(5));
    }    
}
