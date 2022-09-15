import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeNo(n);
    }

    public static void primeNo(int n) {
        boolean[] prime = new boolean[n+1];
        int count = 0;
        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }
        for (int i = 2; i < prime.length; i++) {
            if(prime[i] == true) {
                for (int j = i+i; j < prime.length; j = j+i) {
                    prime[j] = false;
                }
            }
        }


        for (int i = 2; i < prime.length; i++) {
            if(prime[i] == true) {
                count++;
            }
        }
        System.out.println(count);
}
}
