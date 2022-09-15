import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
        
            int[] arr = new int[n];
            int sum = 0;
            for(int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            for(int j = 0; j < arr.length; j++) {
                sum += arr[j] * arr[j];
            }
            double mean = (double) sum / n;
            System.out.printf("%.6f", Math.pow(mean, 0.5));
        
    }
}
