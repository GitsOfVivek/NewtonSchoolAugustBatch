import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int mod=1000000007;
    public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            
            while(t-->0){
                long k=sc.nextLong();
                System.out.println(alwarModArithmetic(k)); 
            }
    }
    public static long power(long x,long k){
        long ans=1;
        while(k>0){
            if(k%2==1)
            ans=(x*ans)%mod;
            k=k/2;
            x=(x*x)%mod; 
        }
        return ans%mod;
    }
    public static long alwarModArithmetic(long k){
        //if(k==1)
        return 10*(power(2,k-1))%mod;
       // return (2*(alwarModArithmetic(k-1)%mod)%mod);
    }
}
