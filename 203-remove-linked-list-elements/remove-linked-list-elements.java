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
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre=new ListNode(0);
       ListNode temp=head,prev=pre;
        while(temp!=null){
            if(temp.val!=val){
               prev.next=temp;
                prev=temp;
            } 
            temp=temp.next;
        }
        prev.next=null;
        return pre.next;
    }
}
