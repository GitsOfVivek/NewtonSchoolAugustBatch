import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static String reverse(String str)
    {
        char ch;
        String revStr="";
        for(int i=0; i<str.length(); i++)
        {
            ch=str.charAt(i);
            revStr = ch +revStr;
        }
        return revStr;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String subStr;
        String subStr1;
        for(int i=0; i<=str.length(); i++)
        {   
            for(int j=i+1; j<=str.length(); j++)
            {
               subStr=str.substring(i,j);
               subStr1=reverse(subStr);
               if(subStr.equals(subStr1)){
                 System.out.print("Yes");
                 return;
               }
            }
        }
        System.out.print("No");
    }
}
