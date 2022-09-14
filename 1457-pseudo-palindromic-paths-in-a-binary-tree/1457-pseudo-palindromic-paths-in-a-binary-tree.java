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
    int freq[]=new int[10];
    int count=0;
    public int pseudoPalindromicPaths (TreeNode root) {        
        dfs(root);
        return count;
    }
    public void dfs(TreeNode root)
    {
        if(root==null) return ;
        
        freq[root.val]++;
        
        if(root.left==null && root.right==null)
        {
            int oddCount=0;
            for(int x=1;x<=9;x++)
            {
                oddCount+=freq[x]%2;
            }
            if(oddCount<=1)
            {
                count++;
            }
        }
        dfs(root.left);
        dfs(root.right);
        
        freq[root.val]--;
    }
}