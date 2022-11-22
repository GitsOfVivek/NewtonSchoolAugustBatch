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

        int s = 0;
        int e = arr.length-1;
        int leftSum = 0;
        int rightSum = 0;
        int ans = 0;
        while(s <= e) {
            if(leftSum == rightSum) {
                ans = leftSum;
            }
            if(leftSum <= rightSum) {
                leftSum += arr[s];
                s++;
            }else {
                rightSum += arr[e];
                e--;
            }
        }
        System.out.println(ans);
    }
}
