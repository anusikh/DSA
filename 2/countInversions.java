// Count Inversions

class Main{
    
   static int merge(int arr[], int l, int m, int r) {
      int i = l;
      int j = m + 1;
      int k = l;
    
      int swaps = 0;
      int temp[] = new int[5];
    
      while (i <= m && j <= r){
        if (arr[i] <= arr[j]) {
          temp[k] = arr[i];
          i++;
          k++;
        } else {
          temp[k] = arr[j];
          j++;
          k++;
          swaps += (m + 1) - (l + i);
        }
      }
    
      while (i <= m) {
        temp[k] = arr[i];
        i++;
        k++;
      }
    
      while (j <= r) {
        temp[k] = arr[j];
        j++;
        k++;
      }
    
      for (int p = l; p <= r; p++) {
        arr[p] = temp[p];
      }
      
      return swaps;
    }
    
    
    static int mergeSort(int arr[], int l, int r) {
        int swaps = 0;
        
        if (l < r){
            int m = (l + r) / 2;
            swaps+=mergeSort(arr, l, m);
            swaps+=mergeSort(arr, m + 1, r);
            swaps+=merge(arr, l, m, r);
        }
        
        return swaps;
    }
    
    public static void main (String[] args) {
        int arr[] = {1, 20, 6, 4, 5};
        
        System.out.println(mergeSort(arr, 0, arr.length-1));
        
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]+",");
        // }
    }
}