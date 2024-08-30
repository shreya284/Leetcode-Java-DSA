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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //base-case to check if both p & q are null
        if(p == null && q == null)
        {
            return true;
        }
        else if(p == null || q == null)//to check if either p or q is null
        {
            return false;
        }
        else if(p.val != q.val)//to check if p.val is not equal to q.val
        {
            return false;
        }

        //call the recursive function isSameTree for both left & right nodes of p & q
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
