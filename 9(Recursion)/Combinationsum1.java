// Combination sum-1

class Solution {
    
    public void solution(int ind, int[] candidates, int target, List<List<Integer>> ans, List<Integer> ds){
        
        if(ind == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        
        if(target >= candidates[ind]){
            ds.add(candidates[ind]);
            solution(ind, candidates, target-candidates[ind], ans, ds);
            ds.remove(ds.size()-1);
        }
        solution(ind+1, candidates, target, ans ,ds);
        
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        
        solution(0, candidates ,target, ans, new ArrayList<>());
        return ans;
    }
}