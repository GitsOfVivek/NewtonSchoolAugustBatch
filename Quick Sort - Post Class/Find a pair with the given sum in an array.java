import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                          // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int t = sc.nextInt();
        int i = 0;
        int j = n-1;
        while(i < j) {
            if(arr[i] + arr[j] == t){
                System.out.println("Pair found ("+arr[j]+", "+arr[i]+")");
                return;
            } else if(arr[i]+arr[j] > t){
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Pair not found");
    }
}
