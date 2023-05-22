public class Recursion 
{
    public static int func(int n)
    {
        if(n==1) return 1;
        else return n+func(n-1);
    }
    public static void main(String[] args) 
    {
        System.out.println(func(5));
    }    
}
