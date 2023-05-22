import java.util.*;

public class BitManipulation {
    public static Scanner sc = new Scanner(System.in);

    public static void checkEvenOrOdd(int a) {
        int bitMask = 1;
        if ((a & bitMask) == 1) {
            System.out.println(a + " is Odd");
        } else {
            System.out.println(a + " is Even");
        }
    }

    public static int getIthBit(int a, int i) {
        // bitmask = 1<<i
        int bitMask = 1 << i;
        return (a & bitMask);

    }

    public static int setIthBit(int a, int i) {
        // bitmask = 1<<i
        int bitMask = 1 << i;
        return (a | bitMask);

    }

    public static int clearIthBit(int a, int i) {
        // bitmask = ~(1<<i)
        int bitMask = ~(1 << i);
        return (a & bitMask);

    }

    public static void UpdateIthBit(int a, int i, int newBit) { // 10,2,1
        // Approach 1:
        if (newBit == 1)
            System.out.println( setIthBit(a, i));
        else
            System.out.println( clearIthBit(a, i));

        // Approach 2
        // bitmask = newBit<<i;
        a= clearIthBit(a, i);                    // a = 1010 -> 1000 
        int bitMask = newBit << i;               // 0001<<2 ->0100
        System.out.println((a | bitMask));       // 1010 | 0100 -> 1110

    }

    public static int clearLastIBits(int a,int i)
    {
        int bitMask= -1<<i;
        return a & bitMask;
    }

    public static void main(String[] args) {

        // System.out.print("Enter the number: ");
        // int a = sc.nextInt();
        System.out.println(clearLastIBits(11, 1));    
        sc.close();
    }
}
