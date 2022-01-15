// Kth Permutation Sequence

class Solution {
    public String getPermutation(int n, int k) {
        String ans = "";
        int fact =1;
        List<Integer>  numbers = new ArrayList<>();
        for(int i=1;i<n; i++){
            fact = fact *i;
            numbers.add(i);
        }
        numbers.add(n); // This adds the nth number
        
        k = k-1; // Because indexing starts from 0
        while(true){
            ans = ans + numbers.get(k/fact);
            numbers.remove(k/fact);
            if(numbers.size() == 0)
                break;
            
            k = k%fact;
            fact = fact/numbers.size();
        }
        
        return ans;
    }
}