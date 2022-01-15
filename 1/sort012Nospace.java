// Sort an array of 0, 1 and 2 using no extra space and sorting algo

import java.util.*;

class Main{
    
    static void sortArr(int[] arr){
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for(int i=0;i<arr.length; i++){
            if(arr[i] == 0) cnt0++;
            else if(arr[i] ==1) cnt1++;
            else cnt2++;
        }
        
        int j = 0;
        
        while(cnt0>0){
            arr[j++] = 0;
            cnt0--;
        }
        
        while(cnt1>0){
            arr[j++] = 1;
            cnt1--;
        }
        
        while(cnt2>0){
            arr[j++] = 2;
            cnt2--;
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
    
    public static void main (String[] args) {
        int[] arr = {1,2,2,0,0,1,0};
        sortArr(arr);
    }
}