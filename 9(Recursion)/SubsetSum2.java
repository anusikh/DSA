class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Array.sort(nums);
        bt(0, new ArrayList<Integer>(), nums);
        return res;
    }
    
    public void bt(int index, ArrayList<Integer> curr, int[] nums){
        res.add(new ArrayList<Integer>(curr));
        for(int i= index; i<nums.length;i++){
            if(i!=index && nums[i] == nums[i-1]) continue;
            curr.add(nums[i]);
            bt(i+1, curr, num);
            curr.remove(curr.size()-1);
        }
    }
}