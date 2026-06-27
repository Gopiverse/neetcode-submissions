class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c) || Character.isLetter(c)) {
                str += Character.toLowerCase(c);
            }
        }
        int start = 0;
        int end = str.length()-1;
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
