import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    static void countOddSum(int arr[], int n) {
        int sum = 0;
        int evenSum = 0;
        int oddSum = 0;
        long count = 0;

        for(int i = 0; i < n; i++) {
            sum = (sum + arr[i]) % 2; //oddd or even
            if(sum == 1) {
                count = count + 1 + evenSum;
                oddSum++;
            }else {
                count = count + oddSum;
                evenSum++;
            }
        }

        System.out.print(count);
    }
    public static void main (String[] args) {
            // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i< n ; i++){
        arr[i] = sc.nextInt();
        }
        countOddSum(arr , n);
    }

}
