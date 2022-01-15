// Reverse Pairs

class Main{
    
   static int merge(int arr[], int l, int m, int r) {
      int i = l;
      int j = m + 1;
      int y = m+1;
      int k = l;
      int cnt = 0;
      
      for(int x=l; x<=m; x++){
          while(y>=0 && arr[x]>(2*arr[y]))
            y--;
        cnt += y-(m+1);
      }
    
      
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
      
      return cnt;
    }
    
    
    static int mergeSort(int arr[], int l, int r) {
        int cnt = 0;
        
        if (l < r){
            int m = (l + r) / 2;
            cnt+=mergeSort(arr, l, m);
            cnt+=mergeSort(arr, m + 1, r);
            cnt+=merge(arr, l, m, r);
        }
        
        return cnt;
    }
    
    public static void main (String[] args) {
        int arr[] = {1,3,2,3,1};
        
        System.out.println(-1*mergeSort(arr, 0, arr.length-1));
    }
}