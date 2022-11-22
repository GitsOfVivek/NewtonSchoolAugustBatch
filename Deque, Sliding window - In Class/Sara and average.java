import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        long sum = 0;
        while(i < w) {
            sum += arr[i];
            System.out.print(sum/(i+1) + " ");
            i++;
        }
        for(int j = w; j < n; j++) {
            sum = sum + arr[j] - arr[j-w];
            System.out.print(sum/w + " ");
        }
    }
}
