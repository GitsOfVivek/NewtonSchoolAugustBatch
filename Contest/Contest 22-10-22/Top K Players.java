import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static class Data{
        int data1;
        int data2;
    }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc=new Scanner(System.in);
                      int n=sc.nextInt();
                      int k=sc.nextInt();
                      Data[] arr=new Data[n];
                      for(int i=0;i<n;i++){
                          arr[i]=new Data();
                          arr[i].data1=sc.nextInt();
                      }
                      for(int i=0;i<n;i++){
                          arr[i].data2=sc.nextInt();
                      }
                      Arrays.sort(arr,(o1,o2)->{
                          if(o1.data1==o2.data1) return o2.data2-o1.data2;
                          return o2.data1-o1.data1;
                      });
                      for(int i=0;i<k;i++){
                          System.out.println(arr[i].data1+" "+arr[i].data2);
                      }
    }
}
