import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character, Integer> map=new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        List<Character> [] bucket=new List[str.length()+1];
        for(Character key:map.keySet()){
            int frequency=map.get(key);
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=bucket.length-1; i>=0; i--){
            if(bucket[i]!=null){
                for(char c:bucket[i]){
                    for(int j=0; j<map.get(c); j++){
                        sb.append(c);
                    }
                }
            }
        }
        System.out.print(sb.toString());
        
    }
}
