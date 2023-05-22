import java.util.*;
public class RemoveDuplicatesRec {
    public static void func(String s,int x,StringBuilder sb,boolean arr[])
    {
        if(x==s.length()) return;
        else
        {
            char c=s.charAt(x);
            if(arr[c-97]==false)
            {
                arr[c - 97] = true;
                sb.append(c);
            } 
        }
        func(s,x+1,sb,arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        String s=sc.next();
        boolean arr[]=new boolean[26];
        func(s,0,sb,arr);
        System.out.println(sb);
        sc.close();


    }
}
