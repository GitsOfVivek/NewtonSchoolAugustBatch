import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long powerOfTwoNumbers(long a,long b, long mod){
        long ans=1;
        while(b>0){
            if(b%2==1){
                ans=(ans*a) % mod;
            }
            b=b/2;
            a=(a*a) % mod;
        }
        return ans;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long mod = 1000000007;
        while(t-- > 0) {
            long a=sc.nextInt();
            long b=sc.nextInt();
            long c=sc.nextInt();
            long bc = powerOfTwoNumbers(b,c,mod-1); // Euler’s Theorem
            long abc = powerOfTwoNumbers(a,bc,mod);
            System.out.println(abc);
        }
    }
}
