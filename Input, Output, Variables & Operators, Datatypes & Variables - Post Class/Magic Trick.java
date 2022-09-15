import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 1;
        int ans = x + a;
        ans = 2*ans;
        ans += b;
        ans /= 2;
        ans -= x;
        System.out.print(ans);
    }
}
