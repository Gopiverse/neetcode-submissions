class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<String, List<String>> mpp = new HashMap<>();

        for(String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortedKey = new String(arr);

            if(!mpp.containsKey(sortedKey)) {
                mpp.put(sortedKey, new ArrayList<>());
            }
            mpp.get(sortedKey).add(s);
        }
        return new ArrayList<>(mpp.values());
        
    }
}
