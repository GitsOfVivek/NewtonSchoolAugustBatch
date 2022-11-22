import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] boy = new int[n];
        int[] toy = new int[m];
        for(int i = 0; i < n; i++) {
            boy[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++) {
            toy[i] = sc.nextInt();
        }
        
        Arrays.sort(boy);
        Arrays.sort(toy);
        int count = 0;
        int i = 0;
        int j = 0;
        while(i < n && j < m) {
            if(Math.abs(boy[i] - toy[j]) <= k) {
                count++;
                i++;
                j++;
                continue;
            }
            else {
                if(boy[i] > toy[j]) {
                    j++;
                }else {
                    i++;
                }
            }
        }
        System.out.println(count);
    }
}
