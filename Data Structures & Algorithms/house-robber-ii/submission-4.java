class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        // Case 1: Don't rob the last house
        int[] nums1 = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            nums1[i] = nums[i];
        }

        // Case 2: Don't rob the first house
        int[] nums2 = new int[n - 1];
        for (int i = 1; i < n; i++) {
            nums2[i - 1] = nums[i];
        }

        return Math.max(robHelper(nums1), robHelper(nums2));
    }

    private int robHelper(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int[] dp = new int[n];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }

        return dp[n - 1];
    }
}