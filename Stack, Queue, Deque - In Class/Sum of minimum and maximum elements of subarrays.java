import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=k-1;
        long sum=0;
        while(j<n){                          
            min = findmin(arr,i,j);
            max = findmax(arr,i,j);
            sum= sum+(max+min);
            i++;
            j++;
        }
        System.out.println(sum);
    }
    public static int findmin(int arr[], int start,int end){
        int min=Integer.MAX_VALUE;
        for(int i=start;i<=end;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
     public static int findmax(int arr[], int start,int end){
        int min=Integer.MIN_VALUE;
        for(int i=start;i<=end;i++){
            if(arr[i]>min){
                min=arr[i];
            }
        }
        return min;
    }
}
