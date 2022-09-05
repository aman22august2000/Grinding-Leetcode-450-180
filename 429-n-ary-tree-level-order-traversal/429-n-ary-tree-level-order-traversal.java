/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new LinkedList<List<Integer>>();
        
        if(root==null) return ans;
        
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer> ls=new LinkedList<>();
            int len=q.size();
            for(int i=0;i<len;i++)
            {
                Node cur=q.poll();
                ls.add(cur.val);
                for(Node c:cur.children)
                    q.offer(c);
            }
            ans.add(ls);
        }
        return ans;
    }
}