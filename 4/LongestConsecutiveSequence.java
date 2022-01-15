// Longest Consecutive Sequence 

import java.util.Set;
import java.util.HashSet;

class Main{
    
   
    static int lconsSeq(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int n: arr){
            set.add(n);
        }
        
        int result = 0;
        
        for(int n: arr){
            int count =1;
            
            int down = n-1;
            while(set.contains(down)){
                set.remove(down);
                down--;
                count++;
            }
            
            int up = n+1;
            while(set.contains(up)){
                set.remove(up);
                up++;
                count++;
            }
            
            result = Math.max(result, count);
        }
        
        return result;
    }
    
    public static void main (String[] args) {
        int arr[] = {100, 4, 200, 1, 2, 3};
        
       System.out.println(lconsSeq(arr));
    }
};
