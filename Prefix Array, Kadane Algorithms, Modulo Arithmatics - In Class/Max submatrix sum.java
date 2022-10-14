import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static int largest(int[][] matrix, int m, int n) {
    int  result = matrix[0][0];
    for (int i = 0; i < m; i++) {
      int[] cur = new int[n];
      for (int j = i; j < m; j++) {
        for (int k = 0; k < n; k++) {
          cur[k] += matrix[j][k];
        }
        //largest subarray sum
        int min = 0, max = cur[0], preSum = 0;
        for (int num : cur) {
          preSum += num;
          max = Math.max(max, preSum - min);
          min = Math.min(min, preSum);
        }
        result = Math.max(result, max);
      }
    }
    return result;
  }
  
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int matrix[][] = new int [m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(largest(matrix, m, n)); 
    }
}
