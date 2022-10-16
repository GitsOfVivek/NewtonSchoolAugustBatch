# Questions asked in DSA - 1 (Easy Level)

> ### Take an Array, Reverse it and Print it.

```java

class Main{
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5};
       int n = arr.length;
       for(int i = 0; i <= n / 2; i++) {
           int temp = arr[i];
           arr[i] = arr[n - 1 - i];
           arr[n - 1 - i] = temp;
       }
       for(int i = 0; i < n; i++) {
           System.out.println(i);
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
 
 > ### What is the Time Complexity of Bubble Sort?
  > **Answer :** O(N<sup>2</sup>)
