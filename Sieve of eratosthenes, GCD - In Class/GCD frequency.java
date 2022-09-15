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
        int[] ans = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
                ans[i] = count;
            }
        }
        for(int i = 0; i < n; i++) {
            sum += GCD(arr[i], ans[i]);
        }
        System.out.print(sum);
    }
    public static long GCD(long a, long b) {
        while(b !=  0) {
            if(a>b) {
                a = a-b;
            }
            else{
                b = b-a;
            }
        }
        return a;
    }
}
