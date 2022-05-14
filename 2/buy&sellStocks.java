// Buy and sell stocks
// Also called Valley peak approach

class Solution {
    public int maxProfit(int prices[]){
        int res = 0;
        int prof = 0;
        int i=0;
        int j=1;
        while(j<prices.length){
            if(prices[j]>=prices[i]){
                prof = prices[j] - prices[i];
                res = Math.max(prof, res);
                j++;
            }
            else{
                i++;
            }
        }
        
        return res;
    }
}