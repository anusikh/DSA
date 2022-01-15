// Rotate a Matrix
// To rotate a matrix we need to first Rotate it diagonally and then through the middle

class Main{
    
    static void rotateMatrix(int arr[][]){
        
        // Diagonal Rotation, also known as transpose
        for(int i=0; i<4; i++){
            for(int j=0; j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        // Rotation through middle
        for(int i=0; i<4; i++){
            for(int j=0; j< 2; j++){ // 2 because N/2 where N is 4
                int temp = arr[i][j];
                arr[i][j] = arr[i][4-j-1];
                arr[i][4-j-1] = temp;
            }
        }
    }
    
    public static void main (String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                            { 5, 6, 7, 8 },
                            { 9, 10, 11, 12 },
                            { 13, 14, 15, 16 } };
                            
        rotateMatrix(arr);
        
        int n=arr.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print( arr[i][j] + " ");
            System.out.println("\n");
        }
    }
}