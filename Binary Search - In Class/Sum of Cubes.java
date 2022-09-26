import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
Scanner sc = new Scanner(System.in);
long n = sc.nextLong();
long[] arr = new long[(int)(Math.cbrt(n) + 1)];
for(int i = 1; i < arr.length; i++) {
    arr[i] = i;
}
int i = 1;
int j = arr.length-1;
while(i < j) {
    if(Math.pow(arr[i], 3) + Math.pow(arr[j], 3) == n) {
        System.out.print("YES");
        break;
    }
    else if(Math.pow(arr[i], 3) + Math.pow(arr[j], 3) > n) {
        j--;
    }else {
        i++;
    }
}
if(i >= j) {
    System.out.print("NO");
}
    }
}
