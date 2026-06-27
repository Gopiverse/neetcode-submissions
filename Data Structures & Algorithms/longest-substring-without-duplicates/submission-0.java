class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int len = 0;
        HashMap<Character, Integer> mpp = new HashMap<>();

        for(int end=0; end<s.length(); end++) {
            char c = s.charAt(end);
            if(mpp.containsKey(c)) {
                if(start <= mpp.get(c)) {
                    start = mpp.get(c) + 1;
                }    
            }
            len = Math.max(len, end-start+1);
            mpp.put(c, end);
        }
        return len;
    }
}
