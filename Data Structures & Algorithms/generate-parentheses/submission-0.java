class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backtrack(0, 0, n, stack);
        return res;
    }

    private void backtrack(int openN, int closedN, int n, StringBuilder stack) {
        if(openN == closedN && openN == n) {
            res.add(stack.toString());
            return;
        }
        if(openN < n) {
            stack.append('(');
            backtrack(openN+1, closedN, n, stack);
            stack.deleteCharAt(stack.length()-1);
        }
        if(closedN < openN) {
            stack.append(')');
            backtrack(openN, closedN+1, n, stack);
            stack.deleteCharAt(stack.length()-1);
        }
    }
}
