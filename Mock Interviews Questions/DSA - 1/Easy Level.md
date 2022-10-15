# Questions asked in DSA - 1 (Easy Level)

> ### Take an Array as input, Reverse it and Print it.

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
 
 > ### Write code for Bubble Sort.
 
 ```java
class Main{
  public static void main(String[] args)  {
    int[] arr = {5, 4, 3 ,2, 1};
    for(int i = 0; i < n; i++) {
      for(int j = 1; j < n - i; j++) {
        if(arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for(int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
  }
}

```
 
 > ### What id the Time Complexity of Bubble Sort?
  > **Answer :** O(N<sup>2</sup>)
