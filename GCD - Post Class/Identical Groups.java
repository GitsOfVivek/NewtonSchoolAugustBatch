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
        System.out.print(gcd(a,b));
    }
    static int gcd(int a, int b) {
            if(a==0)
                return b;
            if(b == 0 || a==b) 
                return a;
            if(a>b) {
                return gcd(a-b,b);
            }
            return gcd(a,b-a);
    }
}
