import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int count = 0;
        while(a > 0) {
            if((a & 1) == 1) {
                count++;
            }
            a = a>>1;
        }
        
        System.out.print(count);

    }
}
