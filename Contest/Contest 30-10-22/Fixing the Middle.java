//FIXING THE MIDDLE
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int t = sc.nextInt();
                      while(t-->0){

                          int n = sc.nextInt();

                          int size =0;

                          
                          int arr[] = new int[1000];
                          while(n>0){
                            arr[size++] = n%2;
                            n=n/2;
                          }
                         
                          

                          if(size%2==0){
                            if(arr[size/2]==0){
                                arr[size/2]=1;
                            }
                            else arr[size/2]=0;

                            if(arr[size/2-1]==0) arr[size/2-1]=1;
                            else arr[size/2-1]=0;
                          }

                          else{
                              if(arr[size/2]==0) arr[size/2]=1;
                              else arr[size/2]=0;
                          }
                          
                          String str = "";
                          for(int x = size-1;x>=0;x--){
                            str=str+String.valueOf(arr[x]);
                          }
                          int decimal = Integer.parseInt(str,2);
                          System.out.print(decimal);
                          System.out.println();
                        
                          
                          }


                      }
    }
