import java.util.*;
public class FindStrLengthRec {
    public static int func(String s,int x)
    {
        
        try
        {
           char c= s.charAt(x);
        }
        catch(Exception e)
        {
            return x;
        }
        return(func(s,x+1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s=sc.next();
        // String a="abc";
        // System.out.println(a.charAt(3));
        System.out.println(func(s, 0));
        sc.close();
    }
}
