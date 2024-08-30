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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        if(root == null)
        {
            return list;
        }
        return inOrder(root,list);
    }
    
    public List<Integer> inOrder(TreeNode tree,List<Integer> list)
    {
        if(tree.left != null)
        {
            inOrder(tree.left,list);
        }
        
        list.add(tree.val);
        
        if(tree.right != null)
        {
            inOrder(tree.right,list);
        }
        return list;
    }
}
