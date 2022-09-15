import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int F = sc.nextInt();
        int C = (F-32) * 5 / 9;
        System.out.print(C);
    }
}
