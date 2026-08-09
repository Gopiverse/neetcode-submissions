class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {

        backtrack(nums, 0, new ArrayList<>());

        return ans;
    }

    private void backtrack(int[] nums, int index, List<Integer> current) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Take the current element
        current.add(nums[index]);

        backtrack(nums, index + 1, current);

        // Undo
        current.remove(current.size() - 1);

        // Don't take the current element
        backtrack(nums, index + 1, current);
    }
}
