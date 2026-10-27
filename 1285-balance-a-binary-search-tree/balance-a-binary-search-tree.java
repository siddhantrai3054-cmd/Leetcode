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
// 1382. Balance a Binary Search Tree
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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        solve(ans, root);
        return bst(ans, 0, ans.size()-1);
    }
     public void solve(List<Integer> ans, TreeNode root) {
        if (root == null) return;
        solve(ans, root.left);
        ans.add(root.val);
        solve(ans, root.right);
    }
    public TreeNode bst(List<Integer> ans, int st, int end){
        if(st > end) return null;
        int mid = (st + end) / 2;
        TreeNode root = new TreeNode(ans.get(mid));
        root.left = bst(ans, st, mid-1);
        root.right = bst(ans, mid+1, end);
        return root;
    }
}