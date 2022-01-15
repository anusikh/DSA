// Subset Sum
import java.util.*;

class Main{
    
    void subsetSum(int index, int sum, List<Integer> l, int n, List<Integer> res){
        if(index == n){
            res.add(sum);
			return;
        }
        subsetSum(index+1, sum+l.get(index), l, n, res);
        subsetSum(index+1,sum, l, n, res);
    }
    
    
    public static void main (String[] args) {
        Main m = new Main();
        List<Integer> l = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        l.add(3);
        l.add(1);
        l.add(2);
        
        m.subsetSum(0, 0, l, 3, res);
        Collections.sort(res);
        
        for(int i=0; i<res.size(); i++){
            System.out.println(res.get(i));
        }
    }
} 