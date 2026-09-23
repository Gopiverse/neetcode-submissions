class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);

        int prefixSum = 0;
        int result = 0;

        for(int num : nums) {
            prefixSum += num;
            if(mpp.containsKey(prefixSum - k)) {
                result += mpp.get(prefixSum - k);
            }

            mpp.put(prefixSum, mpp.getOrDefault(prefixSum, 0)+1);
        }
        return result;
    }
}