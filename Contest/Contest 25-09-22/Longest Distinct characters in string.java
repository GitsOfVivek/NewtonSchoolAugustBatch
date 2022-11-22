import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
        public static void function(String str) {
                int n=str.length();
                int res=0;
                int arr[]=new int[512];
                Arrays.fill(arr,-1);
                int i=0;
                for(int j=0; j<n; j++) {
                        i=Math.max(i,arr[str.charAt(j)]+1);
                        res=Math.max(res,j-i+1);
                        arr[str.charAt(j)]=j;
                }
                System.out.print(res);
                System.out.println();
        }
        public static void main (String[] args) {
        // Your code here
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                while(t-->0) {
                        String str=sc.next();
                        function(str);
                }                                                                                                                                                                                                                        
        }
}
