import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                          // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String cr=sc.next();
        String cd=sc.next();
        int ans=0;
        for(int i=0;i<n;i++){
            int num1=cr.charAt(i)-'0';

            int num2=cd.charAt(i)-'0';
            int forward = Math.abs(num1-num2);

            int backward=10-forward;
            if(forward<backward){
                ans+=forward;
            }
            else{
                ans+=backward;
            }
        }
        System.out.println(ans);
    }
}
