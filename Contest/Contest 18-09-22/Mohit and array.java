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
        int sumOfArr = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sumOfArr += arr[i];
        }
        int sumOfNum = (n*(n+1))/2;
        int ans = sumOfNum - sumOfArr;
        System.out.print(ans);
    }
}
