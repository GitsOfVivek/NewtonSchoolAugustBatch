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
            double d = b*b - 4*a*c;
            if(d < 0) {
                d = -1 * d;
                double r11 = (double) (-1 * b)/(2*a);
                double r12 = (double) Math.pow(d, 0.5)/(2*a);
                double r21 = (double) (-1 * b)/(2*a);
                double r22 = (double) Math.pow(d, 0.5)/(2*a);
                
                System.out.printf("%.2f", r11);
                System.out.print("+" + "i");
                System.out.printf("%.2f", r12);
                System.out.println();

                System.out.printf("%.2f", r21);
                System.out.print("-" + "i");
                System.out.printf("%.2f", r22);
            }else{
            double r1 = ((-1 * b) + Math.pow(d, 0.5))/(2*a);
            double r2 = ((-1 * b) - Math.pow(d, 0.5))/(2*a);
            System.out.printf("%.2f", r1);
            System.out.println();
            System.out.printf("%.2f", r2);
    }       }
}
