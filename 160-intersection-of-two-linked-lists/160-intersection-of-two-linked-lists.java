/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      int lenA=length(headA),lenB=length(headB);
      //move headA and headB to the same point
      while(lenA>lenB)
      {
        headA=headA.next;
        lenA--;
      }
      while(lenB>lenA)
      {
        headB=headB.next;
        lenB--;
      }
      //find intersection until end
      while(headA!=headB)
      {
        headA=headA.next;
        headB=headB.next;
      }
      return headA;
    }
    private int length(ListNode node)
    {
      int len=0;
      while(node.next!=null)
      {
        node=node.next;
        len++;
      }
      return len;
    }
}