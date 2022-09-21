import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int smallestSubWithSum (long arr[], int n, long x) {
        long curr_sum = 0; int min_len = n + 1;
        int start = 0, end = 0;
        while(end < n)  {
            while(curr_sum < x && end < n)
                curr_sum += arr [end++];
                while (curr_sum >= x && start < n) {
                    if ( end - start < min_len ) 
                        min_len = end - start;
                        curr_sum -= arr[start++];
                }
        }
        return min_len;
    }
    public static void main (String[] args)throws IOException {
         //Your code here
         //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader( new InputStreamReader (System.in));
        String[] s = br.readLine().split( " " );
        int n = Integer.parseInt(s[0]);
        long x = Long.parseLong(s[1]);
         /* int n = sc.nextInt();
         int x = sc.nextInt();*/
        long []arr = new long[n];
        String[] d = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
            arr[i] = Long.parseLong(d[i]);
        }
        int min_len = smallestSubWithSum(arr,n,x);
        System.out.print(min_len);
     }
}
