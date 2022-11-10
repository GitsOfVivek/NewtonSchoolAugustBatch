import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

  public static int powerOfTwoNumbers(int a,int b){
        int ans=1;
        while(b>0){
            if(b%2==1){
                ans=ans*a;
            }
            b=b/2;
            a=a*a;
        }
        return ans;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n>30){
            System.out.println(m);
            return;
        }
        int power = powerOfTwoNumbers(2,n);
        System.out.println(m%power);
    }
}
