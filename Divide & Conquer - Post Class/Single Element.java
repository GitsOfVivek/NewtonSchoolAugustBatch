import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long ans = singleElement(arr, 0);
        System.out.print(ans);
    }
    static long singleElement(long[] arr, int a) {
        while(a < arr.length-1) {
            if(arr[a] == arr[a+1]) {
                a = a+2;
            }else {
                return (long) arr[a];
            }
        }
        return (long) arr[arr.length-1];
    }
}
