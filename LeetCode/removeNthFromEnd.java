class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l1=new ListNode();
        l1.next=head;
       ListNode ptr = l1;
        ListNode p = ptr;
        for(int i=0;i<n;i++){
            p=p.next;
        }
        while(p.next!=null){
            p=p.next;
            ptr=ptr.next;
        }
        ptr.next=ptr.next.next;
        return l1.next;   
    }
}
