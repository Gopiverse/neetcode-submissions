class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1 = 0;
        int p2 = 0;
        String result = "";

        while(p1 < word1.length() && p2 < word2.length()) {
            result += word1.charAt(p1); p1++;
            result += word2.charAt(p2); p2++;
        }

        while(p1 < word1.length()) {
            result += word1.charAt(p1); p1++;
        }

        while(p2 < word2.length()) {
            result += word2.charAt(p2); p2++;
        }

        return result;
    }
}