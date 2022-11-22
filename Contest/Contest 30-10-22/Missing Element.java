import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        for(int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }
        int xor = arr[0];
        for(int i = 1; i < n-1; i++) {
            xor = xor^arr[i];
        }
        System.out.print(xor);
    }
}
