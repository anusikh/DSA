// 2 Sum problem

import java.util.Map;
import java.util.HashMap;

class Main{
    
    public int[] TwoSumProb(int arr[], int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int x = target - arr[i];
            if(map.containsKey(x)){
                return new int[] {map.get(x), i};
            }else{
                map.put(arr[i], i);
            }
        }
        return new int[]{};
    }
    
    public static void main (String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        
        Main m = new Main();
        int result[] = m.TwoSumProb(arr, target);
        
        for(int i=0;i< result.length; i++){
            System.out.println(result[i]);
        }
    }
};
