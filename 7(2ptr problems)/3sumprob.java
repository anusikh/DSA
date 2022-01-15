// 3 SUM problem

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    
    void triplet(int arr[], int size, int sum){
        
        int l, r;
        
        for(int i=0; i< size-2; i++){
            l = i+1;
            r = size-1;
            while(l<r){
                if(arr[i]+arr[l]+arr[r] == sum){
                    System.out.println("The triplet is: "+arr[i]+" "+arr[l]+" "+arr[r]);
                }
                else if(arr[i]+arr[l]+arr[r] < sum){l++;}
                else{r--;}
            }
        }
        
        System.out.println("No Triplet");
    }

    public static void main (String[] args) {
        Main m = new Main();
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int size = A.length;
        Arrays.sort(A);
        m.triplet(A, size, sum);
    }    
}