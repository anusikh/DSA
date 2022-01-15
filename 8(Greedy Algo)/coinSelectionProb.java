// Coin Selection
import java.util.*;

class Main{
    
    void coinProb(int[] den, int v){
        
        List<Integer> res = new ArrayList<>();
        
        for(int i=den.length-1-1;i>=0; i--){
            while(v >= den[i]){
                v -= den[i];
                res.add(den[i]);
            }
        }
        
        for(int i=0; i<res.size(); i++){
            System.out.println(res.get(i));
        }
    }
    
    public static void main (String[] args) {
        Main m =  new Main();
        
        int den[] = {1,2,5,10,20,50,100,500,1000};
        int v = 150;
        
        
        m.coinProb(den, v);
    }
}