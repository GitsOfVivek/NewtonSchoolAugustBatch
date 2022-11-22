import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        long [] arr = new long[n+1];
        while(x-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for(int i = a; i <= b; i++) {
                arr[i] += c;
            }
        }
        long curSum = arr[0];
        long max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 1; i <= n; i++) {
            curSum += arr[i];
            if(max < curSum) {
                max = curSum;
            }
            if(curSum < 0) {
                curSum = 0;
            }
            
        }
        System.out.println(max);
    }
}
