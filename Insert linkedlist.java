public class Main {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node NewNode=new Node(data);
        if(head==null){
            head=tail=NewNode;
            return;
        }
        NewNode.next=head;
        head=NewNode;
    }
    public static void main(String s[]){
      Main l1=new Main();
        l1.addFirst(2);
        l1.addFirst(1);
    }
}

