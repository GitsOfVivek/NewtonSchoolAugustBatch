import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    static boolean isLargeInCol(int arr[][],int i, int j, int minVal,int m,int n)
    {
        for(int p=0;p<m;p++)
        {
            if(arr[p][j]>minVal)
            {
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        ArrayList <Integer> ans = new ArrayList<>();
        int minRow = 0;
        int minCol =0;
        //   int minVal = Integer.MAX_VALUE;

        for(int i=0; i<m; i++)
        {
            int minVal =Integer.MAX_VALUE;
            for(int j =0; j<n; j++)
            {
                if(arr[i][j]<minVal)
                {
                    minRow=i;
                    minCol =j;
                    minVal = arr[i][j];
                }
            }   
            boolean a = isLargeInCol(arr,i,minCol,minVal,m,n);
            // System.out.println(minVal);
                if(a)
                {
                    ans.add(minVal);
                }
        }
        if(ans.isEmpty())
        {
            System.out.println(-1);
        }
        else{
            for(int i=0;i<ans.size();i++)
            {
                System.out.print(ans.get(i) + " ");
            }
        }
    }
}
