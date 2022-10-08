import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String[] line0 = br.readLine().split(" ");
            int n = Integer.parseInt(line0[0]);
            int k = Integer.parseInt(line0[1]);
            int[] arr = new int[n];
			String[] line = br.readLine().split(" ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(line[i]);
            }
            System.out.println(longestSubarrayWithSumK(arr, k));
        }
    }

    public static int longestSubarrayWithSumK(int arr[], int k) {
		
		int ps = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int maxLength = 0;
		
		for(int i = 0; i < arr.length; i++) {
			ps = ps + arr[i];
			if(map.containsKey(ps) == false) {
				map.put(ps, i);
			}
			
			if(map.containsKey(ps - k) == true) {
				// posible solution
				int idxPsMK = map.get(ps - k); 
				if(i - idxPsMK > maxLength) 
					maxLength = i - idxPsMK;
			}
		}
		
		return maxLength;
	}
}
