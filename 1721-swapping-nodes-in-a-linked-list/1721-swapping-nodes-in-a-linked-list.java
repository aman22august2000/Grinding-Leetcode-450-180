/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
      
      ListNode pNode=head;
      List<ListNode> nodelist=new ArrayList<>();
      
      //store values of nodes in an arryalist
      while(pNode!=null)
      {
        nodelist.add(pNode);
        pNode=pNode.next;
      }
      
      //swap of their values
      int l=nodelist.size();
      int temp=nodelist.get(k-1).val;
      nodelist.get(k-1).val=nodelist.get(l-k).val;
      nodelist.get(l-k).val=temp;
      
      return head;
    }
}