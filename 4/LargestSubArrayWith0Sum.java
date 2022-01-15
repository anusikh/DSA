// Largest Subarray with 0 sum 
// https://www.youtube.com/watch?v=_yGf2rxwZlA

import java.util.Map;
import java.util.HashMap;

class Main{
    
    static int function(int arr[]){
        Map<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        int len = 0;
        map.put(sum, -1);
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                len = Math.max(len, i-map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
        
        return len;
    }
    
    public static void main (String[] args) {
        int arr[] = {1, 2, 3, -1, 0, -1, -1};
        
        System.out.println(function(arr));
    }
};
