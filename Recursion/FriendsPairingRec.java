import java.util.*;
public class FriendsPairingRec {
    public static int func(int n)
    {
        if(n==1||n==2) return n;
        int single=func(n-1);
        int pair=func(n-2);
        int pairChoice=(n-1)*pair;
        return single*pairChoice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(func(n));
        sc.close();
    }
}
