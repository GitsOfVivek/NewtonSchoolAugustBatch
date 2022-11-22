import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long a = sc.nextLong();
            String s = Long.toBinaryString(a);
            int l = s.length();
            long count = 0;
            for(int i = 0; i < l; i++) {
                if(s.charAt(i) == '1') {
                    count++;
                }
            }
            count = (long)Math.pow(2, count);
            System.out.println(count);

        }
    }
}
