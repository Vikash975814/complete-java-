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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        {
            return head;
        }
     ListNode curr=head;
     int num=1;
      while(curr.next!=null)
      {
          curr=curr.next;
          num++;
      }
      k%=num;
      if(k==0)
      {
          return head;
      }
     curr.next=head;
      ListNode ptr=head;
      for(int i=0;i<num-1-k;i++)
      {
          ptr=ptr.next;
      }
      ListNode temp=ptr.next;
      ptr.next=null;
      return temp;
    }
}
