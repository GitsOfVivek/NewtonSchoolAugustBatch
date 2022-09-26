import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static boolean sortedArrayRotatedClockwise(int arr[], int n){
        int a = 0;
        int b = 0;
        for(int i=0; i<n-1; i++){
            if(arr[i]<arr[i+1])
            a++;
            else
            b++;
        }
        if(a==1 || b==1){
            if(arr[n-1]<arr[0])
            a++;
            else
            b++;
        if(a==1 || b==1)
        return true;
        }
        return false;
    }
    public static void main (String[] args) {
            // Your code here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int j=0; j<n; j++){
                arr[j]=sc.nextInt();
            }
            boolean a = sortedArrayRotatedClockwise(arr,n);
            if(a==true)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }
}
