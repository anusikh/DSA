// Rain water trapping problem

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    
    void rainwaterTrapping(int arr[]){
        
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        
        left[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }
        
        right[arr.length - 1] = arr[arr.length - 1];
        for(int i=arr.length-2; i>=0; i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }
        
        int res = 0;
        for(int i=0; i< arr.length; i++){
            res+= Math.min(left[i],right[i]) - arr[i];
        }
        
        System.out.println(res);
      
    }

    public static void main (String[] args) {
        Main m = new Main();
        int arr[] = { 3,1,2,4,0,1,3,2};
        m.rainwaterTrapping(arr);
    }    
}