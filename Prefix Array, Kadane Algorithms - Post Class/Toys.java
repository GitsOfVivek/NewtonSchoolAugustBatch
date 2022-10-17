import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
          while (t-->0){
              int k = sc.nextInt();
              for(int i=0;i<n;i++){
                  sum+=arr[i];// sum = 2+5
                  n = n-k; // 6-4 = 2 // 
                }
              System.out.println(sum);
              sum=0;
              n= arr.length;
            }
  }
}
