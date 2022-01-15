// Find dup in an Array of N+1 integers


import java.util.*;

class Main{
    
    
    void findDups(int[] arr){
        for(int i=0; i<arr.length; i++){
            int j = Math.abs(arr[i]);
            if(arr[j]>=0)
                arr[j] = -arr[j];
            else
                System.out.println(j+" ");
        }
    }
    
    
    public static void main (String[] args) {
        int[] arr1 = {1, 2, 3, 1, 3, 0, 0, 6 };
        Main x = new Main();
        x.findDups(arr1);
    }
}
