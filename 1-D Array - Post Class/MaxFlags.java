import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[m];
            int[] ans = new int[n];
            //input of arr
            for(int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < m; i++) {
                if(arr[i] <= n) {
                    int x = arr[i];
                    ans[x-1] += 1;
                }else if (arr[i] > n) {
                    int max = ans[0];
                    for(int j = 0; j < n; j++) {
                        max = Math.max(max, ans[j]);
                    }
                    for(int j = 0; j < n; j++) {
                        ans[j] = max;
                    }

                }
            }
            for(int j = 0; j < n; j++) {
                System.out.print(ans[j] + " ");
            }
            System.out.println();

        }
    }
}
