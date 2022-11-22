import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                       Scanner sc = new Scanner(System.in);
                        String str= sc.next();
                        int arrsize=sc.nextInt();
                        int[] arr=new int[arrsize];
                        for(int i=0;i<arrsize;i++){
                        arr[i]=sc.nextInt();
                        }
                        char[] ch=str.toCharArray();
                        int[] arr2=new int[ch.length/2];
                        for(int i=0;i<arrsize;i++){
                            for(int j=arr[i]-1;j<arr2.length;j++){
                                arr2[j]++;
                            }
                        }
                        int chlen=ch.length;
                        for(int i=0;i<chlen/2;i++){
                            if(arr2[i]%2!=0){
                                char temp=ch[i];
                                ch[i]=ch[chlen-i-1];
                                ch[chlen-i-1]=temp;
                            }
                        }
                        String str2=String.valueOf(ch);
                        System.out.print(str2);
    }
}
