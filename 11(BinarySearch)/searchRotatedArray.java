// Search Elemnet in a rotated Array

import java.util.*;

class Main{
   
   int find(int[] arr, int x){
       
       int l=0;
       int h=arr.length-1;
       
      while(l<=h){
          int mid = (l+h)/2;
          
          if(arr[mid]==x) return mid;
          // Left Side is sorted
          if(arr[l]<=arr[mid]){
            if(x>=arr[l] && x<=arr[mid])
                h = mid-1;
            else 
                l = mid+1;
          }else{
            if(x>=arr[mid] && x<=arr[h])
                h = mid-1;
            else 
                l = mid+1;
          }
      }
      
      return -1;
      
        
       
   }
    
   public static void main (String[] args) {
        Main m = new Main();
        int arr[] = {2,3,4,0,1};
        System.out.println(m.find(arr, 0));
    }
} 