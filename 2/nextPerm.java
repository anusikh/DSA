// Find Next Permutation
// First find the index1 such that a[i] <= a[i+1]
// Find index2 such that a[index2] >= a[index1]
// swap(a[index1], a[index2])
// reverse(index1+1, a.length-1)

class Main{
    
    static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    static void next_perm(int arr[]){
        int index1 = arr.length-2;
        
        while(index1>=0 && arr[index1]>=arr[index1+1])
            index1--;
        
        if(index1>=0){    
            int index2 = arr.length-1;
            while(index2>=0 && arr[index2] <= arr[index1])
                index2--;
            
            swap(arr, index1, index2);
        }
        
        reverse(arr,index1+1);
    }
    
    public static void main (String[] args) {
        int arr[] = {1, 2, 3};
        next_perm(arr);
        
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]+" ");
    }
}

1 2 3 index1 = 1 index2 = 
