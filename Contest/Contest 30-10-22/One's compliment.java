import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long onesComplement(long n){
        long number_of_bits= (long)(Math.floor(Math.log(n)/Math.log(2)))+1;
        return ((1<<number_of_bits)-1)^n;
    }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int t = sc.nextInt();
                      while(t-->0){
                          long n = sc.nextLong();
                          System.out.println(onesComplement(n));
                      }
    }
}
