class Solution {
    public int squareSum(int num) {
        int sum = 0;
        int temp = num;
        while(temp != 0) {
            sum += Math.pow(temp%10, 2);
            temp = temp/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> mpp = new HashSet<>();
        while(n != 1 && !mpp.contains(n)) {
            mpp.add(n);
            n = squareSum(n);
        }
        return n == 1;
        
    }
}
