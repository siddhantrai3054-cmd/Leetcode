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
// 110. Balanced Binary Tree
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
    boolean balanceFactor = true;
    public boolean isBalanced(TreeNode root) {
        height(root);
        return balanceFactor;
    }
    public int height(TreeNode root){
        if(root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);
        int val = left - right;

        if(val > 1 || val < -1){
            balanceFactor =false;
        }

        return Math.max(left, right) + 1;
    }
}