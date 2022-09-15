import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // first mark all elements are true i.e. prime

        boolean[] prime = new boolean[n+1];
        ArrayList <Integer> allPrime = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            prime[i] = true;
        }
        // logic
        for (int i = 2; i < prime.length; i++) {
            if(prime[i] == true) {
                for (int j = 2 * i; j < prime.length; j += i) {
                    prime[j] = false;                    
                }
            }            
        }

        // adding all prime to ArrayList

        for (int i = 2; i < prime.length; i++) {
            if(prime[i] == true) {
                allPrime.add(i);
            }
        }
        
        // output

        long result = 1;
        for (int i = 0; i < allPrime.size(); i++) {
            long p = allPrime.get(i);
            long exp = 0;
            while (p <= n) {
                exp = exp + (n/p);
                p = p * allPrime.get(i);
            }
            result = result * (exp + 1);
        }
        System.out.println(result);
    }
}
