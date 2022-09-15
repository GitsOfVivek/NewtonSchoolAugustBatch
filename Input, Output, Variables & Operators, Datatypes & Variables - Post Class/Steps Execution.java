import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n+8;
        ans /= 3;
        ans %= 5;
        ans *= 5;
        System.out.print(ans);
    }
}
