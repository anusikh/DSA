// Set Matrix Zeros
// We will create 2 temp arrays

import java.util.*;

class Main{
    
    static void setMatrixZeros(int[][] arr){
        int[] rows = new int[4];
        int[] cols = new int[4];
        
        for(int i=0;i<4; i++){ rows[i] = -1;}
        for(int i=0;i<4; i++){ cols[i] = -1;}
        
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(arr[i][j] == 1){
                    rows[i] = 1;
                    cols[i] = 1;
                }
            }
        }
        
         for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(rows[i]==1 || cols[j]==1){
                    arr[i][j] = 1;
                }
            }
         }
        
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main (String[] args) {
        int[][] arr = { {1, 0, 0, 1},
                          {0, 0, 1, 0},
                          {0, 0, 0, 0},{0, 1, 0, 1}};
                          
        setMatrixZeros(arr);
    }
}