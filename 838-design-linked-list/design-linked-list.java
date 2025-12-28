class MyLinkedList {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
     private Node head=null;
     private Node tail=null;
     private int size=0;
    public MyLinkedList() {
    }
    
    public int get(int index) {
        if(index < 0||index >= size){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node temp=new Node(val);
        if(head==null){
           tail=temp;
        }
        else{
            temp.next=head;
           
        }
         head=temp;
         size++;
    }
    
    public void addAtTail(int val) {
        Node temp=new Node(val);
        if(head==null){ 
            head=temp;
        }
        else{
            tail.next=temp;
        }
        tail=temp;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size){
            return ;
        }
        if(index==0){
            addAtHead(val);
            return ;
        }
        if(index==size){
            addAtTail(val);
            return ;
        }
        Node temp=head;
        Node node=new Node(val);
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
         node.next=temp.next;
         temp.next=node;
         size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;

    if(index == 0){
        head = head.next;
        if(size == 1){
            tail = null;
        }
        size--;
        return;
    }

    Node temp = head;
    for(int i = 0; i < index - 1; i++){
        temp = temp.next;
    }

    if(temp.next == tail){
        tail = temp;
    }

    temp.next = temp.next.next;
    size--;
        
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