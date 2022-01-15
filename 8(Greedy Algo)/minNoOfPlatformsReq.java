// Min No of Platforms
// SOrt the arr and dep times in ascending order
// The first index in dep will tell us when the first train leaves,
//  meanwhile we can increment Platform numbers if arr time is less than the first dep time


import java.io.*;
import java.lang.*;
import java.util.*;

// class MyComparator implements Comparator<meeting>{
    
//     @Override
//     public int compare(meeting o1, meeting o2){
//         if(o1.finish < o2.finish)
//             return -1;
//         else if(o1.finish > o2.finish)
//             return 1;
//         else
//             return 0;
//     }
    
// }


class Main {
    
    static void minNoOfPlatforms(int[] arr, int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int platforms_req = 1;
        int res = 1;
        
        int i=1; // because we have already added  1 platforms_req for the first one
        int j=0;
        
        while(i<arr.length && j<arr.length){
            
            if(arr[i]<=dep[j]){
                platforms_req++;
                 i++;
            }
            
            else if(arr[i]>dep[j]){
                platforms_req--;
                j++;
            }
            
            if(platforms_req>res){
                res = platforms_req;
            }
        }
        
        System.out.println(res);
    }
    
    public static void main (String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = arr.length;
        minNoOfPlatforms(arr, dep);
    }    
}