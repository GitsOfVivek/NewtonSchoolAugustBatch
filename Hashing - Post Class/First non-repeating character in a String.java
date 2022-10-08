import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean f = false;
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < ch.length; i++) {
            if(!map.containsKey(ch[i])) {
                map.put(ch[i], 1);
            }else {
                map.put(ch[i], map.get(ch[i])+1);
            }
        }
        char c = 'c';
        for(int i = 0; i < ch.length; i++) {
            if(map.get(ch[i]) == 1) {
                c = ch[i];
                System.out.print(i);
                f = true;
                break;
            }
        }
        if(!f) {
            System.out.print("-1");
        }
        
    }
}
