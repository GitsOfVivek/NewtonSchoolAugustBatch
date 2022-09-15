import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] arr = new int[m][n];
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            //output 1
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(i == 0 || j == n-1) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
            if(m > 1 && n > 1) {
                for(int i = m-1; i > 0; i--) {
                    for(int j = n-1; j >= 0; j--) {
                        if(i == m-1 && j != n-1 || j == 0) {
                            System.out.print(arr[i][j] + " ");
                        }
                    }
                }
            }

            System.out.println();
            T--;


        }
    }
}
