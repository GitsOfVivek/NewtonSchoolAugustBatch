import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int avg = (a+b+c+d+e)/5;
        if(avg >= 80) {
            System.out.print("A");
        }else if(avg < 80 && avg >= 60) {
            System.out.print("B");
        }else if(avg < 60 && avg >= 40) {
            System.out.print("C");
        }
        else {
            System.out.print("D");
        }

    }
}
