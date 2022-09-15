import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        long sum = 0;
        int extra = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            max = Math.max(max, arr[i]);
            if(arr[i] >= max) {
                System.out.print("0 ");
            }else {
                System.out.print(max-arr[i] + " ");
                extra = extra + (max-arr[i]);
            }
        }
        System.out.println();
        System.out.print(sum+extra);
    }
}
