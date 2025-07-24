/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp=head;
        while(temp!=null){
            Node t=temp.next;
            if(temp.child!=null){
                Node c=flatten(temp.child);
                temp.next=c;
                c.prev=temp;
                //c ko aage le jao
                while(c.next!=null){
                    c=c.next;
                }
                c.next=t;
                if(t!=null)t.prev=c;

            }
            temp.child=null;//very important
            temp=temp.next;
        }
        return head;
    }
}