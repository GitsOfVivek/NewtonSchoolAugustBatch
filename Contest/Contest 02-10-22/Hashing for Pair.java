import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int i = 0;
            int j = n-1;
            boolean f = false;
            while(i < j) {
                if(arr[i] + arr[j] == k) {
                    System.out.println("1");
                    f = true;
                    break;
                }else if(arr[i] + arr[j] > k) {
                    j--;
                }else {
                    i++;
                }
            }
            if(!f) {
                System.out.println("0");
            }
        }
    }
}
