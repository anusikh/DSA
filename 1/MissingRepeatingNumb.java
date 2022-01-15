// Find Missing and Repeating number

import java.util.*;

class Main{
    public static void main (String[] args) {
        int[] arr = {1,2,2,4};
        int repeating = -1;
        int missing = -1;
        
        boolean[] pr = new boolean[arr.length + 1];
        Arrays.fill(pr, false);
        
        for(Integer i: arr){
            if(pr[i] == false)
                pr[i] = true;
            else
                repeating = i;
        }
        
        for(boolean b: pr)
            System.out.println(b);
            
        for(int i=1; i<pr.length; i++){
            if(pr[i] == false){
                missing = i;
            }
        }
        
        System.out.println(missing);
        System.out.println(repeating);
    }
}