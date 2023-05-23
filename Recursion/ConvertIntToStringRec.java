import java.util.*;

//convert 1234 to one two three four
public class ConvertIntToStringRec {
    public static void func(int n,StringBuilder sb)
    {
        if(n==0) return; 
        if(n!=0)
        {
            func(n/10,sb);
        }
        int x=n%10;
        switch (x)
        {
            case 1: 
            {
                sb.append("one ");
                break;
            }
            case 2:
            {
                sb.append("two ");
                break;
            }
            case 3: {
                sb.append("three ");
                break;
            }
            case 4: {
                sb.append("four ");
                break;
            }
            case 5: {
                sb.append("five");
                break;
            }
            case 6: {
                sb.append("six ");
                break;
            }
            case 7: {
                sb.append("seven ");
                break;
            }
            case 8: {
                sb.append("eight ");
                break;
            }
            case 9: {
                sb.append("nine ");
                break;
            }
            case 0:{
                sb.append("zero ");
                break;
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb = new StringBuilder("");
        func(n,sb);
        System.out.print(sb);
        sc.close();
    }
}
