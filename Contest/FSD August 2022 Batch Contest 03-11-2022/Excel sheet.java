import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int m = 1000000007;
        long s = 0L;
        for(int i = 0; i < str.length(); i++) {
            int v = str.charAt(i) - 'A' + 1;
            s = (s * 26) % m;
            s += v;
        }
        System.out.println(s % m);
    }
}
