import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static long modInverse(long a, long m) {
          long m0 = m;
          long y = 0;
          long x = 1;
          while (a > 1) {
               long q = a / m;
               long t = m;
               m = a % m;
               a = t;
               t = y;
               y = x - q * y;
               x = t;
          }
          if (x < 0) {
               x += m0;
          }
          return x;
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          long mod = 1000000007;
          int t = sc.nextInt();
          while (t-- > 0) {
               int i = sc.nextInt();
               int j = sc.nextInt();
               i++;
               j++;
               long c = 1;
               long x = 1;
               for (int p = 1; p < j; p++) {
                    c = c * (i - p);
                    x = x * p;
                    c = c % mod;
                    x = x % mod;
               }
               c = c * modInverse(x, mod);
               c = c % mod;
               System.out.println(c);
          }
     }
}
