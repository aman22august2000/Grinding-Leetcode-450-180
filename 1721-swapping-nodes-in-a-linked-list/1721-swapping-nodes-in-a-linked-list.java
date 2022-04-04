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
      
      ListNode left=head;
      ListNode right=head;
      int cnt=0;
      //find the k-th node
      while(left!=null)
      {
        cnt++;
        if(cnt==k){
          break;
        }
        left=left.next;
      }
      
      //find the k-th last element
      ListNode pNode=left;
      while(pNode.next!=null)
      {
        pNode=pNode.next;
        right=right.next;
      }
      
      //swap there values
      int temp=left.val;
      left.val=right.val;
      right.val=temp;
      
      return head;
    }
}