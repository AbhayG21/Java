import java.util.*;
class BinaryStringsRec
{
    public static void func(int n,int last,String s)
    {
        if(n==0)
        {
            System.out.println(s);
            return;
        }
        func(n-1, 0, s+"0");
        if(last==0)
        {
            func(n-1, 1, s+"1");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        func(n, 0, "");

        
    }
}