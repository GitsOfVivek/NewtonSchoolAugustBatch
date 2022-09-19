import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
           String a = sc.next();
           String b = sc.next();
           String s1,s2;
           if(a.length()<b.length())
           {
               s1 = a;
               s2 = b;
           }
           else{
               s1 = b;
               s2 = a;
           }
           int i=0,j=0;
           while(i<s1.length()&&j<s2.length())
           {
               if(s1.charAt(i)==s2.charAt(j))
               {
                   i++;
                   j++;
               }
               else
               {
                   j++;
               }
           }
           if(i==s1.length())
           {
               System.out.println("#SadLife");
           }
           else
           {
               System.out.println("#DieSingle");
           }
            t--;
        }
    }
}
