import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {

            // Input

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int[] brr= new int[n-1];
        for(int x = 0; x <= n-1; x++) {
            arr[x] = sc.nextInt();
        }
        for(int y = 0; y <= n-2; y++) {
            brr[y] = sc.nextInt();
        }

        // Algorithm

        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int j = 0;
        while(i < n-1){
            stack.push(arr[i]);
            if(stack.peek() == brr[j]){
                stack.pop();
                j++;
            }
            i++;
        }
        if(stack.size() > 1) {
            System.out.print("NO");
        }
        else {
            System.out.print("YES");
        }
    }
}
