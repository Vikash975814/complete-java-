class MyLinkedList {
     LinkedList<Integer> ll;
    public MyLinkedList() {
       ll=new LinkedList<>();
    }
    
    public int get(int index) {
     if(index>=ll.size())
        return -1;
        return ll.get(index);
    }
    
    public void addAtHead(int val) {
        ll.addFirst(val);
    }
    
    public void addAtTail(int val) {
        ll.addLast(val);
    }
    
    public void addAtIndex(int index, int val) {
           if(index<ll.size())
            ll.add(index,val);
            else if(index==ll.size())
            ll.addLast(val);
    }
    
    public void deleteAtIndex(int index) {
        if(index<ll.size())
        ll.remove(index);
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
