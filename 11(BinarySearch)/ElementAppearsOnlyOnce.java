// Elementthat appears only once
// Notes:
// First check if the unique element is in the boundaries
// Also, left side of the unique element, the first duplicate should appear at even place and other should appear at odd place
// At the right side vice versa

import java.util.*;

class Main{
   
   int ElementOnce(int[] arr){
       
       int l=0;
       int h=arr.length-1;
       
       //boundary cases;
       if(h==0)
        return arr[0];
       else if(arr[0] != arr[1])
        return arr[0];
       else if(arr[h]!=arr[h-1])
        return arr[h];
        
       while(l<=h){
            int mid = (l+h)/2;
           
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
                return arr[mid];
            
            if((mid%2==1 && arr[mid]==arr[mid-1])||(mid%2==0 && arr[mid]==arr[mid+1])){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
       }
       
       return -1;
        
       
   }
    
   public static void main (String[] args) {
        Main m = new Main();
        int arr[] = {1,1,2,2,3,4,4};
        System.out.println(m.ElementOnce(arr));
    }
} 