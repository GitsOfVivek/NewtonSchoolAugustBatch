import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++){
			arr[i] = scn.nextInt();
			if(arr[i] == 0){
				arr[i] = -1;
			}
		}
		long sum = 0L; 
		long count = 0L;
		HashMap<Long, Integer> hm = new HashMap<>();
		for(int i =0; i<n; i++){
			sum += arr[i];
			if(sum == 0){
				count++;
			}
			if(hm.containsKey(sum)){
				count += hm.get(sum);
				int freq = hm.get(sum);
				hm.put(sum, freq+1);
			}
			else{
				hm.put(sum, 1);
			}
		}
		System.out.print(count);
	}
}
