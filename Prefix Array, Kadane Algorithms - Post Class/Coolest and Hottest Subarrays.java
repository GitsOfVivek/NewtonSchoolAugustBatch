import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long max(long[] A,int n)
    {
        long MTN=-1000000000L;
        long sum=0;
        for(int i=0;i<n;i++)
        {
           sum=sum+A[i];
           if(sum>MTN)
           {
               MTN=sum;
           }
           if(sum<0)
               sum=0;
        }
        return MTN;
    }
    public static long min(long[] A,int n)
    {
        long STN=1000000000;
        long num=0L;
        for(int i=0;i<n;i++)
        {
            num=num+A[i];
            if(num<STN)
            {
                STN=num;
            }
            if(num>0)
                num=0;
        }
        return STN;
    }
    public static void main(String[] args )
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     long[] A=new long[n];
     for(int i=0;i<n;i++)
     {
         A[i]=sc.nextLong();
     }
        long n1=max(A,n);
     long n2=min(A,n);
        System.out.println(n1-n2);
    }
}
