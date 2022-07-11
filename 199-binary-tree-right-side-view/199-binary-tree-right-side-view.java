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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ls=new ArrayList<Integer>();
        rightview(root,ls,0);
        return ls;
    }
    public void rightview(TreeNode node,List<Integer> ls,int level)
    {
        if(node==null)
        {
            return;
        }
        if(level==ls.size())
        {
            ls.add(node.val);
        }
        rightview(node.right,ls,level+1);
        rightview(node.left,ls,level+1);
    }
}