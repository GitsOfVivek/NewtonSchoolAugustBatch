import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        if(n < 3) {
            System.out.println("No");
            return;
        }
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(str.charAt(i) == 'r' || str.charAt(i) == 'e' || str.charAt(i) == 'd') {
                if(!map.containsKey(str.charAt(i))) {
                    map.put(str.charAt(i), 1);
                    count++;
                }
            }
        }
        if(count < 3) {
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}
