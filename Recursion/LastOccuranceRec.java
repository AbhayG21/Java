public class LastOccuranceRec 
{
    public static int func(int n, int i, int arr[]) {
        if (i == -1)
            return i;
        else if (arr[i] == n)
            return i;
        else
            return func(n, i - 1, arr);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5,1 };
        int n = 1;
        int i=arr.length-1;
        System.out.println(func(n,i, arr));
    }    
}
