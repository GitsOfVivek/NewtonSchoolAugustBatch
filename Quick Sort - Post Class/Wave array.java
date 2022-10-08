import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

        // Quick sort

        // method to find the partition position
  static int partition(int array[], int low, int high) {
    
    // choose the rightmost element as pivot
    int pivot = array[high];
    
    // pointer for greater element
    int i = (low - 1);

    // traverse through all elements
    // compare each element with pivot
    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {

        // if element smaller than pivot is found
        // swap it with the greatr element pointed by i
        i++;

        // swapping element at i with element at j
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }

    }

    // swapt the pivot element with the greater element specified by i
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    // return the position from where partition is done
    return (i + 1);
  }

  static void quickSort(int array[], int low, int high) {
    if (low < high) {

      // find pivot element such that
      // elements smaller than pivot are on the left
      // elements greater than pivot are on the right
      int pi = partition(array, low, high);
      
      // recursive call on the left of pivot
      quickSort(array, low, pi - 1);

      // recursive call on the right of pivot
      quickSort(array, pi + 1, high);
    }
  }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Arrays.sort(a);

        // Sorting

        quickSort(a, 0, n-1);
        

        for(int i = 0; i < n-1; i += 2) {
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }
    // public static void swap(int x, int y) {
    //     int temp = x;
    //     x = y;
    //     y = temp;
    // }
}
