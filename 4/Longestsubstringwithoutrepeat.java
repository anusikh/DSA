// Longest substring without repeat

a b c d e e f g

l = 5
r = 4
len = 0

map = [[a, 0],[b, 1],[c, 2],[d, 3],[e, 5]]



import java.util.Map;
import java.util.HashMap;

class Main{
    
    static int longestSubWithoutRepeat(String arr){
        
        Map<Character, Integer> map = new HashMap<>();
        
        int l = 0, r = 0;
        int len = 0;
        while(r<arr.length()){
            if(map.containsKey(arr.charAt(r))){
                l = Math.max(map.get(arr.charAt(r))+1, l);
            }
            map.put(arr.charAt(r), r);
            len = Math.max(len, r-l+1);
            r++;
        }
        
        return len;
    }
    
   
    
    public static void main (String[] args) {
        String arr = "abcdeefg";
        
       System.out.println(longestSubWithoutRepeat(arr));
    }
};
