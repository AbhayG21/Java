class XToPowNRec {
    // Unoptimised O(n)
    // public static int func(int x,int n)
    // {
    // if(n==0) return 1;
    // else return x*func(x,n-1);
    // }

    // Optimised O(n)
    // public static int func(int x, int n) {
    //     if (n == 0)
    //         return 1;
    //     if (n % 2 == 0) {
    //         return func(x, n / 2) * func(x, n / 2);
    //     } else {
    //         return x * func(x, n / 2) * func(x, n / 2);
    //     }
    // }

    //OptimisedV2.0 O(log n)
    public static int func(int x, int n) {
        if (n == 0)
            return 1;
        int halfPow= func(x, n / 2);
        int halfPowSq=halfPow*halfPow;

       if(n%2!=0) {
            return x * halfPowSq;
        }
        return halfPowSq;
    }

    public static void main(String[] args) {
        System.out.println(func(5, 3));
    }
}