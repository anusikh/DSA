// Count number of subarrays with given XOR(this clears a lot of problems) 

import java.util.HashMap;
import java.util.Map;

class Main{
	
	static void function(int[] arr, int target){
		Map<Integer, Integer> map = new HashMap<>();
		
		int cnt = 0;
		int xorr = 0;
		for(int i=0; i<arr.length; i++){
			xorr = xorr ^ arr[i];
			
			if(map.get(xorr ^ target)!=null)
				cnt+=map.get(xorr ^ target);
			
			if(xorr == target)
				cnt++;
			
			if( map.get(xorr)!=null)
				map.put(xorr, map.get(xorr)+1);
			else map.put(xorr, 1);
		}
		
		System.out.println(cnt);
	}
	
	public static void main(String args[]){
		int arr[] = {4,2,2,6};
		target = 6;
		
		function(arr, target);
	}
}