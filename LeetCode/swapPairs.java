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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
          return head;
        ListNode ptr = new ListNode(0);
        ListNode temp;
        ptr.next = head;
        temp=ptr;
        while(head!=null&&head.next!=null) {
            temp.next = head.next;
            head.next = head.next.next;
            temp.next.next = head;
            temp= temp.next.next;
            head =  head.next;
        }
        return ptr.next;
    }
}
