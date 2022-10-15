# Questions asked in DSA - 1 (Medium Level)

 > ### List differences between quicksort and mergesort.
  > **Answer :** 


 > ### Disadvantages of arrays.
  > **Answer :** 

 > ### Explain hashing and time complexity of hashing.
  > **Answer :** 

 > ### What is the time complexity of bubblesort and binarysearch.
  > **Answer :**


> ### Given a Boolean 2D array, find the index of row that has maximum number of 1s.

```java

class Main{
    public static void main(String[] args) {
        int[][] arr = {
                        {0, 1, 0},
                        {0, 0, 0},
                        {1, 1, 1}
                    };
         int r = 3;
         int c = 3;

       int[] a = new int[r];
       for(int i = 0; i < r; i++) {
           int count = 0;
           for(int j = 0; j < c; j++) {
               if(arr[i][j] == 1) {
                   count++;
               }
           }
           a[i] = count;
       }
       // a = {1, 0, 3};
       int max = 0;
       for(int i = 0; i < r; i++)  {
           max = Math.max(max, a[i]);
       }
       for(int i = 0; i < r; i++) {
           if(max == a[i]) {
               System.out.println(i);
               break;
           }
       }
    } 
}

```
