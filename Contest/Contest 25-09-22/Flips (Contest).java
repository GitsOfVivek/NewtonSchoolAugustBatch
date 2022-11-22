import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        for(int i=0; i<str.length(); i++){
                if(str.charAt(i)=='1'
                        || str.charAt(i)=='3'
                        || str.charAt(i)=='5'
                        || str.charAt(i)=='7'
                        || str.charAt(i)=='9'){
                        count++;
                }
                if(str.charAt(i)=='a'
                        || str.charAt(i)=='e'
                        || str.charAt(i)=='i'
                        || str.charAt(i)=='o'
                        ||str.charAt(i)=='u'){
                        count++;
                }
        }
        System.out.print(count);
        }
}
