// Next Greatest Element

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nge = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        
        for(int num: nums2){
            while(!st.isEmpty() && st.peek()<num)
                nge.put(st.pop(), num);
            st.push(num);
        }
        
        for(int i=0; i<nums1.length; i++){
            nums1[i] = nge.getOrDefault(nums1[i],-1);
        }
        
        return nums1;
    }
}