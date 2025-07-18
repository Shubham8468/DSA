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
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode temp=head;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        while(temp!=null){
            q1.add(temp.val);
           if(temp.next!=null) temp=temp.next.next;
           else{
            break;
           }
        }
        ListNode te=head.next;
        while(te!=null){
            q2.add(te.val);
           if(te.next!=null) te=te.next.next;
           else{
            break;
           }
        }
        int se=q1.size();
        ListNode tem=new ListNode(1);
        ListNode t=tem;
        while(!q2.isEmpty()){
           
         int x=q2.remove();
         ListNode a=new ListNode(x);
            
           t.next=a; 
            t=a;
            
          int y=q1.remove();
          ListNode b=new ListNode(y);
           
          t.next=b;
          t=b;
           
        }
        if(q2.isEmpty()&&!q1.isEmpty()){
            while(!q1.isEmpty()){
                int s=q1.remove();
                ListNode c=new ListNode(s);
                t.next=c;
                t=c;
            }
  
        }
        return tem.next;
    }
}
