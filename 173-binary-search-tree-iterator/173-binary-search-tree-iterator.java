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
class BSTIterator {
        private int index;
        private List<Integer> mList;

        public BSTIterator(TreeNode root) {
            index = 0;
            mList = new ArrayList<>();
            inorderTraversal(root, mList);
        }

        public int next() {
            return mList.get(index++);
        }

        public boolean hasNext() {
            return index < mList.size();
        }

        // Get the result of inorder traversal
        private void inorderTraversal(TreeNode root, List<Integer> mList) {
            if (root == null)
                return;
            inorderTraversal(root.left, mList);
            mList.add(root.val);
            inorderTraversal(root.right, mList);
        }
    }
/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */