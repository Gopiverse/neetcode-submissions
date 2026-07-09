/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public void inorder(TreeNode node, List<Integer> ls) {
        if(node == null) {
            return;
        }
        inorder(node.left, ls);
        ls.add(node.val);
        inorder(node.right, ls);
    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        inorder(root, ls);
        for(int i=0; i<ls.size()-1; i++) {
            if(ls.get(i) >= ls.get(i+1)) {
                return false;
            }
        }
        return true;
    }
}
