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
    public ListNode mergeNodes(ListNode head) {
        ListNode list=new ListNode(0);
        int sum=0;
        ListNode ptr=head.next;
        ListNode temp=list;
        while(ptr!=null)
        {
            while(ptr.val!=0)
            {
                sum+=ptr.val;
                ptr=ptr.next;
            }
        temp.next=new ListNode(sum);
        ptr=ptr.next;
         temp=temp.next;
         sum=0;
    }
    return list.next;
    }
}
