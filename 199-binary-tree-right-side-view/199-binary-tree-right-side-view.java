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
        ArrayList<Integer> list=new ArrayList<Integer>();
        dfs(root,list,0);
        return list;
    }
    public void dfs(TreeNode node,List<Integer> list,int depth)
    {
        if(node!=null)
        {
            if(depth==list.size())
                list.add(node.val);
            
            dfs(node.right,list,depth+1);
            dfs(node.left,list,depth+1);
        }
    }
}