import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int count = 0;
     public static void merge(int arr[],int l, int m, int r){
        int n1= m-l+1;
        int n2= r-m;
        int L[]=new int[n1]; // [0 ,0 ,0 ,0 ] 4
        int R[]=new int[n2]; // [ , , ]

        for(int i=0;i<n1;i++){ // L [0 1 2 3]
            L[i]=arr[l+i];
        }

        for(int i=0;i<n2;i++){
            R[i]=arr[m+1+i];
        }

        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){ // till the time at least both arrays have elements to compare
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
//


    }

    // arr , 0 ,6  -> 0,3   4,6
    public static void mergeSort(int arr[],int l, int r){
        if(l<r){
            int m=l+(r-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
            count++;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        mergeSort(arr,0,n-1);

        

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(count);


    }
}
