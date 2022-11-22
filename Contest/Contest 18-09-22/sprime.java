import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        boolean sprime[] = new boolean[10000001];
        for(int i = 2; i*i < 10000001; i++) {
            if(sprime[i] == false) {
                for(int j = i*i; j < 10000001; j += i) {
                    sprime[j] = true;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            for(int i = n; i > n/2; i--) {
                if(!sprime[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
        
    }
}
