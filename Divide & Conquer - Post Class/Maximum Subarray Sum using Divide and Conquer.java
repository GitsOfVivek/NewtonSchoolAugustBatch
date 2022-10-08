import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int maxSubArray(int[] arr, int low, int hi) {
        if(low > hi) {
            return Integer.MIN_VALUE;
        }
        if(low == hi) {
            return arr[low];
        }
        int mid = low + (hi - low) / 2;
        int lowSum = maxSubArray(arr, low, mid - 1);
        int hiSum = maxSubArray(arr, mid + 1, hi);
        int crossingSum = maxCrossingSum(arr, low, mid, hi);
        return Math.max(Math.max(lowSum, hiSum), crossingSum);
    }
    static int maxCrossingSum(int[] arr, int s, int m, int e) {
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        
        for(int i = m; i >= s; i--) {
            sum += arr[i];
            if(sum > leftSum) {
                leftSum = sum;
            }
        }
        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        for(int i = m; i <= e; i++) {
            sum += arr[i];
            if(sum > rightSum) {
                rightSum = sum;
            }
        }
        return Math.max((leftSum + rightSum - arr[m]), Math.max(leftSum, rightSum));
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(arr, 0, n-1));
    }
}
