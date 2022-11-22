import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException {
                      // Your code here
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String line = br.readLine();
        String[] strs = line.trim().split("\\s+");
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        int count = 0, left = 0, right = n-1;
        while(left < right) {
            while(arr[left] == 0 && left < right){
                left++;
            }
            while(arr[right] == 1 && left < right) {
                right--;
            }
            if(left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
                count++;
            }
        }
        System.out.print(count);      
    }
}
