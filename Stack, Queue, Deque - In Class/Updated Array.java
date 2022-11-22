import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[] arr = new int[n];
        LinkedList<Integer> arr = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            arr.addLast(sc.nextInt());
        }
        int q = sc.nextInt();
        int[]  brr = new int[q];
        for(int i = 0; i < q; i++) {
            int x = sc.nextInt();
            if(x == 1) {
                arr.removeFirst();
            }
            else if(x == 2) {
                arr.remove(1);
            }
            else if(x == 3) {
                arr.removeLast();
            }else {
                arr.remove(arr.size()-2);
            }
        }
        System.out.println(arr.size());
        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
