class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n == 0) return 1;
        if(n == 1) return 1;

        int first = cost[0];
        int sec = cost[1];

        for(int i=2; i<n; i++) {
            int curr = Math.min(first, sec) + cost[i];
            first = sec;
            sec = curr;
        }

        return Math.min(first, sec);
    }
}
