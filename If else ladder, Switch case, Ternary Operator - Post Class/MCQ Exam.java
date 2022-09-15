import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int max = Math.max(p, q);
        max = Math.max(max, r);
        max = Math.max(max, s);
        System.out.print(max);
    }
}
