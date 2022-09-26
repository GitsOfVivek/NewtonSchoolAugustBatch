import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a1 = new int[m];
        int[] a2 = new int[n];
        for(int i = 0; i < m; i++) {
            a1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();
        }
        int[] a = new int[m+n];
        for(int i = 0; i < m; i++) {
            a[i] = a1[i];
        }
        for(int i = 0, j = m+i; i < n && j < m+n; i++, j++) {
            a[j] = a2[i];
        }
        Arrays.sort(a);
        double median = 0;
        if((m+n) % 2 != 0) {
            median = a[(m+n)/2];
        }else {
            median =(double) (a[((m+n)/2) - 1] + a[((m+n)/2)])/2;
        }
        System.out.printf("%.2f", median);
        //System.out.print(Arrays.toString(a));
    }
}
