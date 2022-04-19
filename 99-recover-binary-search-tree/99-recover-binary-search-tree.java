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
  
  TreeNode prev=null, first=null, second=null;
    public void recoverTree(TreeNode root) {
      
      evalSwappedTree(root);
      int temp=first.val;
      first.val=second.val;
      second.val=temp;
    }
  private void evalSwappedTree(TreeNode curr)
  {
    if(curr==null)
      return;
    evalSwappedTree(curr.left);
    if(prev!=null && prev.val>curr.val)
    {
      if(first==null)
        first=prev;
      second=curr;
    }
    prev=curr;
    evalSwappedTree(curr.right);
  }
}