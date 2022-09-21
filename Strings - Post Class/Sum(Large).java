import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.*;

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String aa = sc.next();
        String bb = sc.next();
        BigInteger a = new BigInteger(aa);
        BigInteger b = new BigInteger(bb);
        BigInteger ans = a.add(b);
        System.out.println(ans);
    }
}
