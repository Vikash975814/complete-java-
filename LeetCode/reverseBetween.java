class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dd = new ListNode(0);
        dd.next=head;
        ListNode prev=dd;
         for(int i = 0; i < left - 1; i++)
         prev=prev.next;
        ListNode curr=prev.next;
    for(int i = 0; i < right - left; i++){
        ListNode forw = curr.next; 
            curr.next = forw.next;
            forw.next = prev.next;
            prev.next = forw;
        }
        return dd.next;
    }
}
