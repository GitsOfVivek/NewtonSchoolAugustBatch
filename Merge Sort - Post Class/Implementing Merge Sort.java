public static int[] implementMergeSort(int arr[], int start, int end) {
  if(start < end) {
    int mid = start + (end - start) / 2;
    implementMergeSort(arr, start, mid);
    implementMergeSort(arr, mid+1, end);
    merge(arr, start, mid, end);
    return arr;
  }
  return arr;
}
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
