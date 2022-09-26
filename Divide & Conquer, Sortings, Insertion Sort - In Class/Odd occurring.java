import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);// n^2
        for(int i=0;i<n;i++){
            if(i==n-1){
                System.out.println(arr[i]);
                break;
            }

            if(arr[i]==arr[i+1]){
                i++;
            }
            else{
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
