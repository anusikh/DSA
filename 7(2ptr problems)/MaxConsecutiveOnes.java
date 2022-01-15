// Max consecutive ones

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    
    void maxConsOnes(int arr[]){
        
        int cnt = 0;
        int res = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0)
                cnt = 0;
            else{
                cnt++;
                res = Math.max(res, cnt);
            }
        }
        
        System.out.println(res);
    }

    public static void main (String[] args) {
        Main m = new Main();
        int arr[] = { 1, 1, 1, 0, 0, 1 };
        m.maxConsOnes(arr);
        
    }    
}