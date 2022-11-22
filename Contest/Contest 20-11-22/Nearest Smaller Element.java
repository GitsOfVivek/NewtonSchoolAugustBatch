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
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("-1 ");
        for(int i = 1; i < n; i++) {
            boolean flag = false;
            for(int j = i-1; j >= 0; j--) {
                if(arr[j] <= arr[i]) {
                    System.out.print(arr[j] + " ");
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                System.out.print("-1 ");
            }
        }
    }
}
