// Majority Element (>n/3) Moore Voting Algo


class Main{
    
    static void majorityElement(int arr[]){
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = -1;
        int ele2 = -1;
        
        for(int x: arr){
            if(ele1 == x)
                cnt1++;
            else if(ele2 == x)
                cnt2++;
            else if(cnt1 == 0){
                ele1 = x;
                cnt1=1;
            }
            else if(cnt2 == 0){
                ele2 = x;
                cnt2=1;
            }
            else{
                cnt1--; cnt2--;
            }
        }
        
        System.out.println(ele1 +" "+ele2);
    }
    
    public static void main (String[] args) {
        int arr[] = {1,1,1,1,1,2,2,2,2,2,2,3,3,1};
        majorityElement(arr);
    }
}