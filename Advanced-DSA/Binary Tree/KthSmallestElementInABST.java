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

    private int count;
    private int res;

    public int kthSmallest(TreeNode root, int k) 
    {
        int count = 0;
        inorder(root, k);
        return res;
    }

    private void inorder(TreeNode root, int k) 
    {
        if(root == null)
        {
            return;
        } 

        inorder(root.left, k);
        count++;

        if(count == k)
        {
           res = root.val;
        } 

        inorder(root.right, k);    
    }
}
