class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
            
        }
        int currNum = 0;
        int currStreak = 0;
        int longestStreak = 0;

        for(int num : nums) {
            if(!set.contains(num-1)) {
                currNum = num;
                currStreak = 1;
            }
            while(set.contains(currNum+1)) {
                currNum += 1;
                currStreak += 1;
            }
            longestStreak = Math.max(longestStreak, currStreak);
        }
        return longestStreak;
    }
}
