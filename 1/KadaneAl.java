// Kadane's algorithm

class Main{
    public static void main (String[] args) {
        int[] arr = {-2, 3, -1, 4, -1, 6, 3, -1};
        
        int meh = 0;
        int msf = -9999;
        
        for(int i=0;i<arr.length;i++){
            meh = meh + arr[i];
            if(meh<arr[i])
                meh = arr[i];
            if(msf<meh)
                msf = meh;
        }
        
        System.out.println(msf);
    }
}