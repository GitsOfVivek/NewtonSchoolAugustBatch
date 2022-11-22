import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        long sum = sc.nextLong();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i = 0;
        int j = n-1;
        boolean f = false;
        while(i < j) {
            if(arr[i] + arr[j] > sum) {
                j--;
            }else if(arr[i] + arr[j] < sum) {
                i++;
            }else {
                System.out.println(1);
                f = true;
                break;
            }
        }
        if(!f) {
            System.out.println(0);
        }

    }
}
