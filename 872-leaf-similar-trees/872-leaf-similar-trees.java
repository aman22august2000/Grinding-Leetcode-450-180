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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack <TreeNode> st1=new Stack<>(), st2=new Stack<>();
        st1.push(root1);
        st2.push(root2);
        while(!st1.empty() && !st2.empty())
            if(dfs(st1)!=dfs(st2)) return false;
        return st1.empty() && st2.empty();
    }
    public int dfs(Stack<TreeNode> s)
    {
        while(true)
        {
            TreeNode node=s.pop();
            if(node.right!=null) s.push(node.right);
            if(node.left!=null) s.push(node.left);
            if(node.left==null && node.right==null)
                return node.val;
        }
    }
}