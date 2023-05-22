
import java.util.*;

public class A {
    public static void main(String[] args) {

        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        int len = s.length();
        char ar[] = s.toCharArray();

        int sum = 0;
        int start = 0;
        for (int x = 0; x < ar.length; x++) {
            if (ar[x] != ' ') {
                start = x;
                break;
            }
        }
        if (ar[start] == '-') {
            for (int x = start+1; x < ar.length; x++) {
                int num = (int) ar[x] - 48;
                sum = sum * 10 + num;
            }
            System.out.print(0 - sum);
        } else {

            for (int x = start; x < len; x++) {
                int num = (int) ar[x] - 48;
                sum = sum * 10 + num;
            }
            System.out.print(sum);
        }
        sc.close();
    }
}
