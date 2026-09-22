class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int row=0; row<board.length; row++) {
            for(int col=0; col<board[0].length; col++) {
                int num = board[row][col];
                if(num == '.') {
                    continue;
                }

                if(!seen.add(num + "in row" + row) || !seen.add(num + "in col" + col) || !seen.add(num + " in box " + row/3 + "-" + col/3)) {
                    return false;
                }
            }
        }
        return true;
    }
}
