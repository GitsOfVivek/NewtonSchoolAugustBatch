import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr =  new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        // window sum
        for(int i = 0; i < d; i++) {
            sum += arr[i];
        }
        // checking sum
        if(sum == 0) {
            System.out.println(1);
            return;
        }
        // checking next window
        for(int i = d; i < n; i++) {
            sum = sum + arr[i] - arr[i-d];
            if(sum == 0) {
                System.out.println(i-d+2);
                return;
            }
        }
        System.out.println(-1);
    }
}
