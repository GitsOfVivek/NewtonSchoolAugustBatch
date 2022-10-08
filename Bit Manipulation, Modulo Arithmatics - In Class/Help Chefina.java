import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            int k = sc.nextInt();
            if((n & (1<<(k-1))) == 0) {
                System.out.println("NOT SET");
            }else {
                System.out.println("SET");
            }
            
        }
    }
}
