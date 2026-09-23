class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0)+1);
        }

        List<Integer> res = new ArrayList<>();
        for(int key : mpp.keySet()) {
            if(mpp.get(key) > nums.length/3) {
                res.add(key);
            }
        }
        return res;

    }
}