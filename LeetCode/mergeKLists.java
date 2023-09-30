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
    public ListNode mergeKLists(ListNode[] lists) {
      if(lists==null || lists.length==0){
      return null;
    }  
    return merge(lists,0,lists.length-1);
    }
    public ListNode merge(ListNode[] ll,int i,int j)
    {
      if(i==j)
      {
        return ll[i];
      }
      if(i+1==j)
      {
        return merging(ll[i],ll[j]);
      }
      int mid=(i+j)/2;
      ListNode left=merge(ll,i,mid);
      ListNode right=merge(ll,mid+1,j);
      return merging(left,right);
    }
    public ListNode merging(ListNode l1,ListNode l2)
    {
      ListNode temp=new ListNode(0);
      ListNode curr=temp;
    while(l1!=null && l2!=null)
    {
      if(l1.val<l2.val)
      {
        curr.next=l1;
        l1=l1.next;
      } else{
  curr.next=l2;
  l2=l2.next;
}
curr=curr.next;    
}
if(l1!=null)
{
  curr.next=l1;
}else{
  curr.next=l2;
}
return temp.next;
    }
}
