import java.io.*;
import java.util.*;
class Main
{
    public static void main (String args[]) throws IOException
    {   
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    	int n=Integer.parseInt(br.readLine());
    	long a[] = new long[n];
        String line = br.readLine(); // to read multiple integers line
        String[] strs = line.trim().split("\\s+");
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(strs[i]);
        }
        long[] prefix=new long[n];
        prefix[0]=a[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+a[i];
        }
        long ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((i-j+1)%2==1){
                    if(j==0)ans+=prefix[i];
                    else ans+=prefix[i]-prefix[j-1];
                }
            }
        }
    	System.out.print(ans);
    }
}
