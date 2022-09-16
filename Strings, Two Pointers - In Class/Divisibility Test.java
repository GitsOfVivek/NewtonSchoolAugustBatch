import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = str.length();
        divisibility(str, l);
    }
    public static void divisibility(String str, int l) {
        char x = str.charAt(l-1);
        if(x == '0') {
            int sum = 0;
            for(int i = 0; i < l; i++) {
                sum += str.charAt(i);
            }
            if(sum % 3 == 0) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
        else {
            System.out.println("No");
        }
    }
}
