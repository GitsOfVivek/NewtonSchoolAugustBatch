import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long valueOfX(boolean[] a, long k) {
        int start = 0;
        int end = a.length-1;
        while(start <= end) {
            long mid = start + (end - start) / 2;
            if(mid > 1000000000) {
                return -1;
            }
            long result = (mid * mid - k) + 3 * mid;
            if(result == 0) {
                return mid;
            }else if(result > 0) {
                end--;
            }else {
                start++;
            }
        }
        return -1;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        int end = (int) Math.sqrt(k);
        boolean[] a = new boolean[end];
        System.out.print(valueOfX(a, k));
    }
}
