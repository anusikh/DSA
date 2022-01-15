// Generate all Subarrays

class Main{
    
    void generateSubArrays(int arr[]){
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n;j++){
                for(int k=i; k<=j; k++){
                    System.out.println(arr[k]+" ");
                }
                System.out.println("\n ");
            }
        }
        
    }
    
    public static void main (String[] args) {
        Main m = new Main();
        int[] arr = {1,2,3,4};
        
        m.generateSubArrays(arr);
    }
}