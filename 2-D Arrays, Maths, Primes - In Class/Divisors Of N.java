import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int ans = 1;
            int n = sc.nextInt();
            if(n % 2 != 0) {
                ans = 0;
            }else if(n%2 == 0) {
                for(int i = 2; i*i <= n; i++) {
                    if(n % i == 0 && i % 2 == 0) {
                        ans++;
                    }
                    if(n % (n/i) == 0 && (n/i) % 2 == 0) {
                        ans++;
                    }
                }
            }


            System.out.println(ans);
        }
    }
}
