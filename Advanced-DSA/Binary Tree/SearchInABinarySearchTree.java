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
    public TreeNode searchBST(TreeNode root, int val) {
        //conditions to check when root != null & root.val != val
        while(root != null && root.val != val)
        {
            //to check in ternary operation where if val < root.val ? left/right root
             root = val < root.val ? root.left : root.right;
        }
        return root;//return the answer root
    }
}
