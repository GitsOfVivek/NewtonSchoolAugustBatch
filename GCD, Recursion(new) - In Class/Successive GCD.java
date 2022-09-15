import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a = 0;
        while(n-- > 1) {
            for(int i = 0; i < n; i++) {
                a = gcd(arr[i], arr[i+1]);
                arr[i] = a;
            }
        }
        System.out.print(arr[0]);
    }
    public static int gcd(int a, int b) {
        if(a == 0) {
            return b;
        }
        if(b == 0) {
            return a;
        }
        if(a == b) {
            return a;
        }
        if(a > b) {
            return gcd(a-b, b);
        }
        else {
            return gcd(a, b-a);
        }
    }
}
