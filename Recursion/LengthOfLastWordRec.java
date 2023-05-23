import java.util.*;

public class LengthOfLastWordRec {
    public static int func(String s, int l,int x) {
        if(s.charAt(l)==' ') return x;
        else 
        {
           return func(s, l-1, ++x);
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        int l=s.length();
        // String a="abc";
        // System.out.println(a.charAt(3));
        System.out.println(func(s,l-1,0));
        sc.close();
    }
}
