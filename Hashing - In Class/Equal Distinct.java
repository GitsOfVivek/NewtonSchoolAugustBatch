import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void isEqualDistinctPossible(int [] arr, int n){
        HashMap <Integer, Integer> hm = new HashMap<>();
        int countDublicate = 0;
        int countDistinct = 0;
        for(int i =0; i<n; i++){
            int key = arr[i];

            if(hm.containsKey(key) && hm.get(key)<2){
                hm.put(key, hm.get(key)+1);
                countDublicate++;
                countDistinct--;
            }
            else{
                hm.put(key, 1);
                countDistinct++;
            }
        }
    
        if(countDistinct % 2 == 0 || countDublicate>0)
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int [n];
            for(int i =0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            isEqualDistinctPossible(arr, n);
        }
    }
}
