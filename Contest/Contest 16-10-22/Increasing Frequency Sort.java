import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc= new Scanner(System.in);
                      int arrsize=sc.nextInt();
                      int[] arr= new int[arrsize];
                      for(int i=0;i<arrsize;i++){
                          arr[i]=sc.nextInt();
                      }
                      HashMap<Integer,Integer> hash=new HashMap<>();
                      for(int i=0;i<arrsize;i++){
                          if(hash.containsKey(arr[i])){
                              hash.put(arr[i],hash.get(arr[i])+1);
                          }
                          else{
                              hash.put(arr[i],1);
                          }
                      }
                      ArrayList<Integer> arr2=new ArrayList<>();
                      for(int i=0;i<arrsize;i++){
                          arr2.add(arr[i]);
                      }
                      Collections.sort(arr2,(num1,num2)->{
                          if(hash.get(num1)==hash.get(num2)) return num2-num1;
                          else return (hash.get(num1)-hash.get(num2));
                      });
                      for(Integer elem:arr2){
                          System.out.print(elem+" ");
                      }
    }
    }
