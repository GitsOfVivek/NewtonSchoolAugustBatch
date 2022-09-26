import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

// 15 11 9 7 5.  [-2]
    public static int findMissingValue(int arr[],int n){
        int l=0;
        int r=n-1;
        int d=(arr[r]-arr[l])/n;
        while(l<=r){
            int m=l+(r-l)/2;
            // to find the missing element
            if(m+1<n && arr[m+1]-arr[m]!=d){
                return arr[m+1]-d;
            }
            if(m-1>=0 && arr[m]-arr[m-1]!=d){
                return arr[m]-d;
            }
            // dicard half 
            if(arr[m]-arr[0] != m*d){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return -1;

    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int value=findMissingValue(arr,n);
        System.out.println(value);
    }
}
