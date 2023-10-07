class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here
	Node temp=head;
	  while(temp!=null)
	  {
	      Node curr=temp;
	      while(curr!=null && curr.data==temp.data)
	      {
	          curr=curr.next;
	      }
	      temp.next=curr;
	      temp=temp.next;
	      }
	      return head;
	  }
    }
