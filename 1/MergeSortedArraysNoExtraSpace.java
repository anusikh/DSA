// Merge 2 sorted arrays without extra space

import java.util.*;

class Main{
    
    static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }
    
    static void sortandMergeArr(int[] arr1, int[] arr2){
        int i = arr1.length - 1;
        int j = 0;
        
        while(i>=0 && j<arr2.length){
            if(arr1[i]> arr2[j]){
                swap(arr1[i], arr2[j]);
                i--;
                j++;
            }
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int k=0; k<arr1.length; k++){
            System.out.println(arr1[k]);
        }
        
        
        for(int l=0; l<arr2.length; l++){
            System.out.println(arr2[l]);
        }
        
    }
    
    
    public static void main (String[] args) {
        int[] arr1 = {1, 0, 7, 9};
        int[] arr2 = {2, 4, 6};
        
        sortandMergeArr(arr1, arr2);
    }
}