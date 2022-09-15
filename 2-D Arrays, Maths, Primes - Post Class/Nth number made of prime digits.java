import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static String nthprimedigitsnumber(int number)
{
    int rem;
    String num="";
    while (number>0) {
        rem = number % 4;
        switch (rem) {
        case 1:
            num+='2';
            break;
        case 2:
            num+='3';
            break;
        case 3:
            num+='5';
            break;
        case 0:
            num+='7';
            break;
        }
 
       if (number % 4 == 0)
           number--;
 
        number = number / 4;
    }
     
    return new StringBuilder(num).reverse().toString();
}
 

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T-- > 0) {
        int number = sc.nextInt();
        System.out.println(nthprimedigitsnumber(number));
    }
}
}
