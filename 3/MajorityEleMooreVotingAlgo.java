// Majority Element (>n/2) Moore Voting Algo
// take cnt=0 and ele=0, if cnt==0 then ele=arr[i], if(ele ==arr[i]) cnt++ else cnt--


class Main{
    
    static void majorityElement(int arr[]){
        int cnt = 0;
        int ele = 0;
        
        for(int x: arr){
            if(cnt == 0)
                ele = x;
            if(ele == x)
                cnt++; 
            else
                cnt--;
        }
        
        System.out.println(ele);
    }
    
    public static void main (String[] args) {
        int arr[] = {1,2,2,2,2,2,2,2,2,2,2,2,3,3,1};
        majorityElement(arr);
    }
}