class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len+len];
        for(int i=0; i<nums.length; i++) {
            ans[i] = nums[i];
        }
        for(int i=0; i<nums.length; i++) {
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}