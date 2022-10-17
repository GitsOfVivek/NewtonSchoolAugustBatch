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
            int a = sc.nextInt();
            int m = sc.nextInt();
            boolean f = false;
            for(int i = 1; i <= m; i++) {
                int inv = a * i;
                if(inv % m == 1) {
                    System.out.println(i);
                    f = true;
                    break;
                }
            }
            if(!f) {
                System.out.println(-1);
            }
        } 
    }
}
