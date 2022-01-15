// Remove duplicates from sorted array

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    
    void removeDups(int arr[]){
        
        int i = 0;
        
        for( int j=1 ; j<arr.length; j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        
        System.out.println("No of No dups: "+(i+1));
    }

    public static void main (String[] args) {
        Main m = new Main();
        int arr[] = { 1,2,3,3,4,5};
        m.removeDups(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }    
}