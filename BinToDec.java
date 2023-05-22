import java.util.*;

public class BinToDec {
    public static int convert(int n) {
        int ans = 0;
        int count = 0;
        while (n != 0) {
            int x = n % 10;
            // ans=ans*10 +x;
            ans = ans + x * (int) Math.pow(2, count);
            count++;
            n = n / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number binary: ");
        int n = sc.nextInt();
        System.out.println(convert(n));

        // primeRange(2, 10);

        sc.close();
    }
}