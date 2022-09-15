import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        GCD(a, b);
    }
    public static void GCD(long a, long b) {
        while(b !=  0) {
            if(a>b) {
                a = a-b;
            }
            else{
                b = b-a;
            }
        }
        System.out.print(a);
    }
}
