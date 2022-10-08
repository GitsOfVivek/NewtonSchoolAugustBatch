import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void binary(int n) {
        if(n > 1) {
            binary(n>>1);
        }
        System.out.print(n&1);
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binary(n);
    }
}
