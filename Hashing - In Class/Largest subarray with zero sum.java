import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] line0 = br.readLine().split(" ");
            int n = Integer.parseInt(line0[0]);
            int[] arr = new int[n];
			String[] line = br.readLine().split(" ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(line[i]);
            }
            System.out.println(longestSubarrayWithSumK(arr));
    }

    public static int longestSubarrayWithSumK(int arr[]) {
		
		int ps = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int maxLength = 0;
		
		for(int i = 0; i < arr.length; i++) {
			ps = ps + arr[i];
			if(map.containsKey(ps) == false) {
				map.put(ps, i);
			}
			
			if(map.containsKey(ps) == true) {
				// posible solution
				int idxPsMK = map.get(ps); 
				if(i - idxPsMK > maxLength) 
					maxLength = i - idxPsMK;
			}
		}
		if(maxLength != 0) {
            return maxLength;
        }
        return -1;
	}
}
