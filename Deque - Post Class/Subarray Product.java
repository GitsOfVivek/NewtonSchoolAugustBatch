import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void maxInEveryWindowProduct(int arr[], int n, int k){

        Deque<Integer> deque=new LinkedList<>();
        for(int i=0;i<k;i++){ // process the first k elements
            //remove already existing useless elements
            while (!deque.isEmpty() && arr[i]>arr[deque.peekLast()]){
                deque.removeLast();
            }

            //addition
            deque.addLast(i);
        }
        long sum = 1;
        int mod = 1000000007;
        for(int i=k;i<n;i++){  // 5  ->  <=2
            sum = ((sum % mod) * (arr[deque.peekFirst()]) % mod) % mod; // previous window max

            // remove non window elements, first element of previous window
            while(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.removeFirst();
            }


            //remove already existing useless elements
            while (!deque.isEmpty() && arr[i]>arr[deque.peekLast()]){
                deque.removeLast();
            }

            //addition
            deque.addLast(i);
        }


        sum = ((sum % mod) * (arr[deque.peekFirst()] % mod)) % mod;
        
        System.out.println(sum);


    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(i % 100000000 == 0) {
                System.gc();
            }
        }
        maxInEveryWindowProduct(arr, n, d);
    }
}
