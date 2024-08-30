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
    public int maxDepth(TreeNode root) {
        //base-case for root == null
        if(root == null)
        {
            return 0;
        }

        int l = maxDepth(root.left);//for the left-side l-variable for left root node
        int r = maxDepth(root.right);//for the right-side r-variable for right root node

        return 1 + Math.max(l,r);//return the 1 + maximum of l & r
    }
}
