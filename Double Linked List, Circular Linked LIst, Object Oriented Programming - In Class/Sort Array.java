/*
interface ISort{
    public int[] sort(int[] arr);
}
*/

// implement classes here
class BubbleSort implements ISort{
public int[] sort(int[] arr){
    int n=arr.length;
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    return arr;
}
}
class InsertionSort implements ISort{
public int[] sort(int[] arr){
    int n=arr.length;
    for(int i=1;i<n;i++){
        int temp=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>temp){
            arr[j+1]=arr[j];
            j--; 
        }
        arr[j+1]=temp;
    }
    return arr;
}
}
class MergeSort implements ISort{
public int[] sort(int[] arr){
    mSrt(arr,0,arr.length-1);
    return arr;
}

    static void mSrt(int[] arr,int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mSrt(arr, low, mid);
            mSrt(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
    }
    static void merge(int[] arr,int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }

}
class SelectionSort implements ISort{
public int[] sort(int[] arr){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
    }
    return arr;
}
}
