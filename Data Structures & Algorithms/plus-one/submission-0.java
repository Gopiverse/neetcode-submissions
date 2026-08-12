class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> ls = new ArrayList<>();
        int len = digits.length;    
        int carry = 1;
        for(int i=len-1; i>=0; i--) {
            int sum = digits[i] + carry;
            int placeSum = sum%10;
            carry = sum/10;  
            ls.add(placeSum);
        }
        if(carry > 0) {
            ls.add(carry);
        }
        Collections.reverse(ls);
        
        int lsSize = ls.size();
        int[] arr = new int[lsSize];
        for(int i=0; i<lsSize; i++) {
            arr[i] = ls.get(i);
        }
        return arr;

    }
}