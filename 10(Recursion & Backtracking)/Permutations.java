// Print all permutations of a string/array

 class Solution {
    
    public void solution(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        // Iterate through all the numbers
        for(int i =0; i< nums.length; i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                solution(nums,ds, ans, freq);
                // Backtrack
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length]; // A frequency array
        solution(nums, ds, ans, freq);
        return ans;
    }
}