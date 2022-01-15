// Pascals Triangle
// To find the value at a particular row and column, use r-1Cc-1
// The number of number in each row = line number
// The first and the last value in each row are always the same


class Main{
    
    static void pascals(int x){
        
        int[][] arr = new int[x][x];
        
        for(int l=0;l<x;l++){
            for(int i = 0; i<=l; i++){
                if(i == l || i == 0)
                    arr[l][i] = 1;
                else
                    arr[l][i] = arr[l-1][i] + arr[l-1][i-1];
                System.out.print(arr[l][i]);
            }
            System.out.print("\n");
        }
    }
    
    public static void main (String[] args) {
        int x = 5;
        pascals(x);
    }
}