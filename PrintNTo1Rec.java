public class PrintNTo1Rec
{
    public static void func(int n)
    {
        if(n==1)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println(n);
            func(n-1);
        }
    }
    public static void main(String[] args) 
    {
        func(5);
    }    
}
