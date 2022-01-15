// Search in a 2D matrix

class Main{
    
    static void search(int arr[][], int n, int x){
        int i=0; 
        int j=n-1;
        
        while(i<=n-1 && j>=0){
            if(arr[i][j] == x){
                System.out.println("Found at: "+i+" "+j);
            }
            
            if(arr[i][j] >x)
                j--;
            else
                i++;
        }
    }
    
    public static void main (String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        search(arr, 3, 4);
    }
}

123
456
789