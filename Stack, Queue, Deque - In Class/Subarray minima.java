import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        for(int i = 0; i < n; i++) {
            int min = arr[i];
            for(int j = i; j < n; j++) {
                if(min > arr[j]) {
                    min = arr[j];
                }
                sum += min;
            }
        }
        System.out.println(sum);
    }
}
