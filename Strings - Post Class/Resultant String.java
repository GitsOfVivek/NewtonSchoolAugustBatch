import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str1 = sc.next();
        String str2 = sc.next();
        char a = '1';
        char b = '0';
        for(int i = 0; i < n; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if(ch1==a) {
                if(ch2==a) {
                    System.out.print("0");
                }else {
                    System.out.print("1");
                }
            }else {
                if(ch2==a) {
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
        }
    }
}
